package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes13.dex */
public final class zze {
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzf zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd32) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzg zzgVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzg();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.TreeSet treeSet = new java.util.TreeSet(c2465xb93dbd32.m19772xbc5e1583());
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh[] zzhVarArr = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh[treeSet.size()];
        java.util.Iterator it = treeSet.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.Object obj = c2465xb93dbd32.get(str);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh zzhVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh();
            zzhVarArr[i17] = zzhVar;
            zzhVar.f7277x337a8b = str;
            zzhVar.f7278x394c1a = zza(arrayList, obj);
            i17++;
        }
        zzgVar.f7275x394c13 = zzhVarArr;
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzf(zzgVar, arrayList);
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zza(java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0> list, java.lang.Object obj) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zziVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi();
        if (obj == null) {
            zziVar.f7280x368f3a = 14;
            return zziVar;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzj zzjVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzj();
        zziVar.f7281x394c1c = zzjVar;
        if (obj instanceof java.lang.String) {
            zziVar.f7280x368f3a = 2;
            zzjVar.f7283x394c1e = (java.lang.String) obj;
        } else if (obj instanceof java.lang.Integer) {
            zziVar.f7280x368f3a = 6;
            zzjVar.f7287x394c22 = ((java.lang.Integer) obj).intValue();
        } else if (obj instanceof java.lang.Long) {
            zziVar.f7280x368f3a = 5;
            zzjVar.f7286x394c21 = ((java.lang.Long) obj).longValue();
        } else if (obj instanceof java.lang.Double) {
            zziVar.f7280x368f3a = 3;
            zzjVar.f7284x394c1f = ((java.lang.Double) obj).doubleValue();
        } else if (obj instanceof java.lang.Float) {
            zziVar.f7280x368f3a = 4;
            zzjVar.f7285x394c20 = ((java.lang.Float) obj).floatValue();
        } else if (obj instanceof java.lang.Boolean) {
            zziVar.f7280x368f3a = 8;
            zzjVar.f7289x394c24 = ((java.lang.Boolean) obj).booleanValue();
        } else if (obj instanceof java.lang.Byte) {
            zziVar.f7280x368f3a = 7;
            zzjVar.f7288x394c23 = ((java.lang.Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            zziVar.f7280x368f3a = 1;
            zzjVar.f7282x394c1d = (byte[]) obj;
        } else if (obj instanceof java.lang.String[]) {
            zziVar.f7280x368f3a = 11;
            zzjVar.f7292x394c27 = (java.lang.String[]) obj;
        } else if (obj instanceof long[]) {
            zziVar.f7280x368f3a = 12;
            zzjVar.f7293x394c28 = (long[]) obj;
        } else if (obj instanceof float[]) {
            zziVar.f7280x368f3a = 15;
            zzjVar.f7294x394c29 = (float[]) obj;
        } else if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) {
            zziVar.f7280x368f3a = 13;
            list.add((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) obj);
            zzjVar.f7295x394c2a = list.size() - 1;
        } else {
            int i17 = 0;
            if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32) {
                zziVar.f7280x368f3a = 9;
                com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd32 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32) obj;
                java.util.TreeSet treeSet = new java.util.TreeSet(c2465xb93dbd32.m19772xbc5e1583());
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh[] zzhVarArr = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh[treeSet.size()];
                java.util.Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh zzhVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh();
                    zzhVarArr[i17] = zzhVar;
                    zzhVar.f7277x337a8b = str;
                    zzhVar.f7278x394c1a = zza(list, c2465xb93dbd32.get(str));
                    i17++;
                }
                zziVar.f7281x394c1c.f7290x394c25 = zzhVarArr;
            } else {
                if (!(obj instanceof java.util.ArrayList)) {
                    java.lang.String simpleName = obj.getClass().getSimpleName();
                    throw new java.lang.RuntimeException(simpleName.length() != 0 ? "newFieldValueFromValue: unexpected value ".concat(simpleName) : new java.lang.String("newFieldValueFromValue: unexpected value "));
                }
                zziVar.f7280x368f3a = 10;
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi[] zziVarArr = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi[arrayList.size()];
                int size = arrayList.size();
                java.lang.Object obj2 = null;
                int i18 = 14;
                while (i17 < size) {
                    java.lang.Object obj3 = arrayList.get(i17);
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zza = zza(list, obj3);
                    int i19 = zza.f7280x368f3a;
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
                zziVar.f7281x394c1c.f7291x394c26 = zziVarArr;
            }
        }
        return zziVar;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzf zzfVar) {
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd32 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32();
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh zzhVar : zzfVar.f7273x394c11.f7275x394c13) {
            zza(zzfVar.f7274x394c12, c2465xb93dbd32, zzhVar.f7277x337a8b, zzhVar.f7278x394c1a);
        }
        return c2465xb93dbd32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zza(java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0> list, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd32, java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zziVar) {
        int i17 = zziVar.f7280x368f3a;
        java.lang.Object obj = null;
        int i18 = 14;
        if (i17 == 14) {
            c2465xb93dbd32.m19787xe4673800(str, null);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzj zzjVar = zziVar.f7281x394c1c;
        if (i17 == 1) {
            c2465xb93dbd32.m19777x170df3e2(str, zzjVar.f7282x394c1d);
            return;
        }
        if (i17 == 11) {
            c2465xb93dbd32.m19788x57254a39(str, zzjVar.f7292x394c27);
            return;
        }
        if (i17 == 12) {
            c2465xb93dbd32.m19786x98f2d6ee(str, zzjVar.f7293x394c28);
            return;
        }
        if (i17 == 15) {
            c2465xb93dbd32.m19782x8db2c1cc(str, zzjVar.f7294x394c29);
            return;
        }
        if (i17 == 2) {
            c2465xb93dbd32.m19787xe4673800(str, zzjVar.f7283x394c1e);
            return;
        }
        if (i17 == 3) {
            c2465xb93dbd32.m19780xca8953c0(str, zzjVar.f7284x394c1f);
            return;
        }
        if (i17 == 4) {
            c2465xb93dbd32.m19781x69bc108d(str, zzjVar.f7285x394c20);
            return;
        }
        if (i17 == 5) {
            c2465xb93dbd32.m19785xf2e7ce2b(str, zzjVar.f7286x394c21);
            return;
        }
        if (i17 == 6) {
            c2465xb93dbd32.m19783xc5c55e60(str, zzjVar.f7287x394c22);
            return;
        }
        if (i17 == 7) {
            c2465xb93dbd32.m19776xf2e368b7(str, (byte) zzjVar.f7288x394c23);
            return;
        }
        if (i17 == 8) {
            c2465xb93dbd32.m19775x1c849219(str, zzjVar.f7289x394c24);
            return;
        }
        if (i17 == 13) {
            if (list == null) {
                java.lang.String valueOf = java.lang.String.valueOf(str);
                throw new java.lang.RuntimeException(valueOf.length() != 0 ? "populateBundle: unexpected type for: ".concat(valueOf) : new java.lang.String("populateBundle: unexpected type for: "));
            }
            c2465xb93dbd32.m19774x6978d921(str, list.get((int) zzjVar.f7295x394c2a));
            return;
        }
        int i19 = 9;
        if (i17 == 9) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd322 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32();
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh zzhVar : zzjVar.f7290x394c25) {
                zza(list, c2465xb93dbd322, zzhVar.f7277x337a8b, zzhVar.f7278x394c1a);
            }
            c2465xb93dbd32.m19778x6eae4b43(str, c2465xb93dbd322);
            return;
        }
        if (i17 != 10) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(43);
            sb6.append("populateBundle: unexpected type ");
            sb6.append(i17);
            throw new java.lang.RuntimeException(sb6.toString());
        }
        int i27 = 14;
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zziVar2 : zzjVar.f7291x394c26) {
            int i28 = zziVar2.f7280x368f3a;
            if (i27 != 14) {
                if (i28 != i27) {
                    int i29 = zziVar2.f7280x368f3a;
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
                int i37 = zziVar2.f7280x368f3a;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 48);
                sb8.append("Unexpected TypedValue type: ");
                sb8.append(i37);
                sb8.append(" for key ");
                sb8.append(str);
                throw new java.lang.IllegalArgumentException(sb8.toString());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(zzjVar.f7291x394c26.length);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi[] zziVarArr = zzjVar.f7291x394c26;
        int length = zziVarArr.length;
        int i38 = 0;
        while (i38 < length) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzi zziVar3 = zziVarArr[i38];
            if (zziVar3.f7280x368f3a != i18) {
                if (i27 == i19) {
                    com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd323 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32();
                    for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzh zzhVar2 : zziVar3.f7281x394c1c.f7290x394c25) {
                        zza(list, c2465xb93dbd323, zzhVar2.f7277x337a8b, zzhVar2.f7278x394c1a);
                    }
                    arrayList.add(c2465xb93dbd323);
                    i38++;
                    obj = null;
                    i18 = 14;
                    i19 = 9;
                } else if (i27 == 2) {
                    obj = zziVar3.f7281x394c1c.f7283x394c1e;
                } else {
                    if (i27 != 6) {
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(39);
                        sb9.append("Unexpected typeOfArrayList: ");
                        sb9.append(i27);
                        throw new java.lang.IllegalArgumentException(sb9.toString());
                    }
                    obj = java.lang.Integer.valueOf(zziVar3.f7281x394c1c.f7287x394c22);
                }
            }
            arrayList.add(obj);
            i38++;
            obj = null;
            i18 = 14;
            i19 = 9;
        }
        if (i27 == i18) {
            c2465xb93dbd32.m19789x52b7aa77(str, arrayList);
            return;
        }
        if (i27 == 9) {
            c2465xb93dbd32.m19779xcaee9294(str, arrayList);
            return;
        }
        if (i27 != 2) {
            if (i27 == 6) {
                c2465xb93dbd32.m19784x8128e028(str, arrayList);
                return;
            }
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder(39);
            sb10.append("Unexpected typeOfArrayList: ");
            sb10.append(i27);
            throw new java.lang.IllegalStateException(sb10.toString());
        }
        c2465xb93dbd32.m19789x52b7aa77(str, arrayList);
    }
}
