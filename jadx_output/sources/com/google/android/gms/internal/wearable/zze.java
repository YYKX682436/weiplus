package com.google.android.gms.internal.wearable;

/* loaded from: classes13.dex */
public final class zze {
    public static com.google.android.gms.internal.wearable.zzf zza(com.google.android.gms.wearable.DataMap dataMap) {
        com.google.android.gms.internal.wearable.zzg zzgVar = new com.google.android.gms.internal.wearable.zzg();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.TreeSet treeSet = new java.util.TreeSet(dataMap.keySet());
        com.google.android.gms.internal.wearable.zzh[] zzhVarArr = new com.google.android.gms.internal.wearable.zzh[treeSet.size()];
        java.util.Iterator it = treeSet.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.Object obj = dataMap.get(str);
            com.google.android.gms.internal.wearable.zzh zzhVar = new com.google.android.gms.internal.wearable.zzh();
            zzhVarArr[i17] = zzhVar;
            zzhVar.name = str;
            zzhVar.zzga = zza(arrayList, obj);
            i17++;
        }
        zzgVar.zzfy = zzhVarArr;
        return new com.google.android.gms.internal.wearable.zzf(zzgVar, arrayList);
    }

    private static com.google.android.gms.internal.wearable.zzi zza(java.util.List<com.google.android.gms.wearable.Asset> list, java.lang.Object obj) {
        com.google.android.gms.internal.wearable.zzi zziVar = new com.google.android.gms.internal.wearable.zzi();
        if (obj == null) {
            zziVar.type = 14;
            return zziVar;
        }
        com.google.android.gms.internal.wearable.zzj zzjVar = new com.google.android.gms.internal.wearable.zzj();
        zziVar.zzgc = zzjVar;
        if (obj instanceof java.lang.String) {
            zziVar.type = 2;
            zzjVar.zzge = (java.lang.String) obj;
        } else if (obj instanceof java.lang.Integer) {
            zziVar.type = 6;
            zzjVar.zzgi = ((java.lang.Integer) obj).intValue();
        } else if (obj instanceof java.lang.Long) {
            zziVar.type = 5;
            zzjVar.zzgh = ((java.lang.Long) obj).longValue();
        } else if (obj instanceof java.lang.Double) {
            zziVar.type = 3;
            zzjVar.zzgf = ((java.lang.Double) obj).doubleValue();
        } else if (obj instanceof java.lang.Float) {
            zziVar.type = 4;
            zzjVar.zzgg = ((java.lang.Float) obj).floatValue();
        } else if (obj instanceof java.lang.Boolean) {
            zziVar.type = 8;
            zzjVar.zzgk = ((java.lang.Boolean) obj).booleanValue();
        } else if (obj instanceof java.lang.Byte) {
            zziVar.type = 7;
            zzjVar.zzgj = ((java.lang.Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            zziVar.type = 1;
            zzjVar.zzgd = (byte[]) obj;
        } else if (obj instanceof java.lang.String[]) {
            zziVar.type = 11;
            zzjVar.zzgn = (java.lang.String[]) obj;
        } else if (obj instanceof long[]) {
            zziVar.type = 12;
            zzjVar.zzgo = (long[]) obj;
        } else if (obj instanceof float[]) {
            zziVar.type = 15;
            zzjVar.zzgp = (float[]) obj;
        } else if (obj instanceof com.google.android.gms.wearable.Asset) {
            zziVar.type = 13;
            list.add((com.google.android.gms.wearable.Asset) obj);
            zzjVar.zzgq = list.size() - 1;
        } else {
            int i17 = 0;
            if (obj instanceof com.google.android.gms.wearable.DataMap) {
                zziVar.type = 9;
                com.google.android.gms.wearable.DataMap dataMap = (com.google.android.gms.wearable.DataMap) obj;
                java.util.TreeSet treeSet = new java.util.TreeSet(dataMap.keySet());
                com.google.android.gms.internal.wearable.zzh[] zzhVarArr = new com.google.android.gms.internal.wearable.zzh[treeSet.size()];
                java.util.Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    com.google.android.gms.internal.wearable.zzh zzhVar = new com.google.android.gms.internal.wearable.zzh();
                    zzhVarArr[i17] = zzhVar;
                    zzhVar.name = str;
                    zzhVar.zzga = zza(list, dataMap.get(str));
                    i17++;
                }
                zziVar.zzgc.zzgl = zzhVarArr;
            } else {
                if (!(obj instanceof java.util.ArrayList)) {
                    java.lang.String simpleName = obj.getClass().getSimpleName();
                    throw new java.lang.RuntimeException(simpleName.length() != 0 ? "newFieldValueFromValue: unexpected value ".concat(simpleName) : new java.lang.String("newFieldValueFromValue: unexpected value "));
                }
                zziVar.type = 10;
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                com.google.android.gms.internal.wearable.zzi[] zziVarArr = new com.google.android.gms.internal.wearable.zzi[arrayList.size()];
                int size = arrayList.size();
                java.lang.Object obj2 = null;
                int i18 = 14;
                while (i17 < size) {
                    java.lang.Object obj3 = arrayList.get(i17);
                    com.google.android.gms.internal.wearable.zzi zza = zza(list, obj3);
                    int i19 = zza.type;
                    if (i19 != 14 && i19 != 2 && i19 != 6 && i19 != 9) {
                        java.lang.String valueOf = java.lang.String.valueOf(obj3.getClass());
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 130);
                        sb6.append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ");
                        sb6.append(valueOf);
                        throw new java.lang.IllegalArgumentException(sb6.toString());
                    }
                    if (i18 == 14 && i19 != 14) {
                        obj2 = obj3;
                        i18 = i19;
                    } else if (i19 != i18) {
                        java.lang.String valueOf2 = java.lang.String.valueOf(obj2.getClass());
                        java.lang.String valueOf3 = java.lang.String.valueOf(obj3.getClass());
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf2.length() + 80 + valueOf3.length());
                        sb7.append("ArrayList elements must all be of the sameclass, but this one contains a ");
                        sb7.append(valueOf2);
                        sb7.append(" and a ");
                        sb7.append(valueOf3);
                        throw new java.lang.IllegalArgumentException(sb7.toString());
                    }
                    zziVarArr[i17] = zza;
                    i17++;
                }
                zziVar.zzgc.zzgm = zziVarArr;
            }
        }
        return zziVar;
    }

    public static com.google.android.gms.wearable.DataMap zza(com.google.android.gms.internal.wearable.zzf zzfVar) {
        com.google.android.gms.wearable.DataMap dataMap = new com.google.android.gms.wearable.DataMap();
        for (com.google.android.gms.internal.wearable.zzh zzhVar : zzfVar.zzfw.zzfy) {
            zza(zzfVar.zzfx, dataMap, zzhVar.name, zzhVar.zzga);
        }
        return dataMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zza(java.util.List<com.google.android.gms.wearable.Asset> list, com.google.android.gms.wearable.DataMap dataMap, java.lang.String str, com.google.android.gms.internal.wearable.zzi zziVar) {
        int i17 = zziVar.type;
        java.lang.Object obj = null;
        int i18 = 14;
        if (i17 == 14) {
            dataMap.putString(str, null);
            return;
        }
        com.google.android.gms.internal.wearable.zzj zzjVar = zziVar.zzgc;
        if (i17 == 1) {
            dataMap.putByteArray(str, zzjVar.zzgd);
            return;
        }
        if (i17 == 11) {
            dataMap.putStringArray(str, zzjVar.zzgn);
            return;
        }
        if (i17 == 12) {
            dataMap.putLongArray(str, zzjVar.zzgo);
            return;
        }
        if (i17 == 15) {
            dataMap.putFloatArray(str, zzjVar.zzgp);
            return;
        }
        if (i17 == 2) {
            dataMap.putString(str, zzjVar.zzge);
            return;
        }
        if (i17 == 3) {
            dataMap.putDouble(str, zzjVar.zzgf);
            return;
        }
        if (i17 == 4) {
            dataMap.putFloat(str, zzjVar.zzgg);
            return;
        }
        if (i17 == 5) {
            dataMap.putLong(str, zzjVar.zzgh);
            return;
        }
        if (i17 == 6) {
            dataMap.putInt(str, zzjVar.zzgi);
            return;
        }
        if (i17 == 7) {
            dataMap.putByte(str, (byte) zzjVar.zzgj);
            return;
        }
        if (i17 == 8) {
            dataMap.putBoolean(str, zzjVar.zzgk);
            return;
        }
        if (i17 == 13) {
            if (list == null) {
                java.lang.String valueOf = java.lang.String.valueOf(str);
                throw new java.lang.RuntimeException(valueOf.length() != 0 ? "populateBundle: unexpected type for: ".concat(valueOf) : new java.lang.String("populateBundle: unexpected type for: "));
            }
            dataMap.putAsset(str, list.get((int) zzjVar.zzgq));
            return;
        }
        int i19 = 9;
        if (i17 == 9) {
            com.google.android.gms.wearable.DataMap dataMap2 = new com.google.android.gms.wearable.DataMap();
            for (com.google.android.gms.internal.wearable.zzh zzhVar : zzjVar.zzgl) {
                zza(list, dataMap2, zzhVar.name, zzhVar.zzga);
            }
            dataMap.putDataMap(str, dataMap2);
            return;
        }
        if (i17 != 10) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(43);
            sb6.append("populateBundle: unexpected type ");
            sb6.append(i17);
            throw new java.lang.RuntimeException(sb6.toString());
        }
        int i27 = 14;
        for (com.google.android.gms.internal.wearable.zzi zziVar2 : zzjVar.zzgm) {
            int i28 = zziVar2.type;
            if (i27 != 14) {
                if (i28 != i27) {
                    int i29 = zziVar2.type;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 126);
                    sb7.append("The ArrayList elements should all be the same type, but ArrayList with key ");
                    sb7.append(str);
                    sb7.append(" contains items of type ");
                    sb7.append(i27);
                    sb7.append(" and ");
                    sb7.append(i29);
                    throw new java.lang.IllegalArgumentException(sb7.toString());
                }
            } else if (i28 == 9 || i28 == 2 || i28 == 6) {
                i27 = i28;
            } else if (i28 != 14) {
                int i37 = zziVar2.type;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 48);
                sb8.append("Unexpected TypedValue type: ");
                sb8.append(i37);
                sb8.append(" for key ");
                sb8.append(str);
                throw new java.lang.IllegalArgumentException(sb8.toString());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(zzjVar.zzgm.length);
        com.google.android.gms.internal.wearable.zzi[] zziVarArr = zzjVar.zzgm;
        int length = zziVarArr.length;
        int i38 = 0;
        while (i38 < length) {
            com.google.android.gms.internal.wearable.zzi zziVar3 = zziVarArr[i38];
            if (zziVar3.type != i18) {
                if (i27 == i19) {
                    com.google.android.gms.wearable.DataMap dataMap3 = new com.google.android.gms.wearable.DataMap();
                    for (com.google.android.gms.internal.wearable.zzh zzhVar2 : zziVar3.zzgc.zzgl) {
                        zza(list, dataMap3, zzhVar2.name, zzhVar2.zzga);
                    }
                    arrayList.add(dataMap3);
                    i38++;
                    obj = null;
                    i18 = 14;
                    i19 = 9;
                } else if (i27 == 2) {
                    obj = zziVar3.zzgc.zzge;
                } else {
                    if (i27 != 6) {
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(39);
                        sb9.append("Unexpected typeOfArrayList: ");
                        sb9.append(i27);
                        throw new java.lang.IllegalArgumentException(sb9.toString());
                    }
                    obj = java.lang.Integer.valueOf(zziVar3.zzgc.zzgi);
                }
            }
            arrayList.add(obj);
            i38++;
            obj = null;
            i18 = 14;
            i19 = 9;
        }
        if (i27 == i18) {
            dataMap.putStringArrayList(str, arrayList);
            return;
        }
        if (i27 == 9) {
            dataMap.putDataMapArrayList(str, arrayList);
            return;
        }
        if (i27 != 2) {
            if (i27 == 6) {
                dataMap.putIntegerArrayList(str, arrayList);
                return;
            }
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder(39);
            sb10.append("Unexpected typeOfArrayList: ");
            sb10.append(i27);
            throw new java.lang.IllegalStateException(sb10.toString());
        }
        dataMap.putStringArrayList(str, arrayList);
    }
}
