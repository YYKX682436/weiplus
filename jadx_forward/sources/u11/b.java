package u11;

/* loaded from: classes5.dex */
public abstract class b {
    public static u11.a a(java.lang.String str) {
        java.util.Map e17 = e(str.toUpperCase(), null, true, true);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.b() ? (u11.a) e17.get("US") : (u11.a) e17.get(str.toUpperCase());
    }

    public static java.util.List b(boolean z17) {
        return new java.util.ArrayList(e(null, null, true, z17).values());
    }

    public static java.lang.String c(java.lang.String str) {
        for (u11.a aVar : e(null, str, true, true).values()) {
            if (aVar.f505261b.equals(str)) {
                return aVar.f505262c;
            }
        }
        return "";
    }

    public static java.lang.String d(java.lang.String str) {
        for (u11.a aVar : e(null, str, false, true).values()) {
            if (aVar.f505261b.equals(str)) {
                return aVar.f505260a;
            }
        }
        return "";
    }

    public static java.util.Map e(java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        u11.a aVar;
        int i17;
        int i18;
        byte[] bytes;
        int i19;
        int i27;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String[] stringArray = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559532bf);
        for (int i28 = 0; i28 < stringArray.length; i28++) {
            java.lang.String[] split = stringArray[i28].trim().split(":");
            if (split.length < 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CountryCodeUtil", "this country item has problem %s", stringArray[i28].trim());
            } else if ((str == null || split[0].equalsIgnoreCase(str)) && (str2 == null || split[1].equalsIgnoreCase(str2))) {
                java.lang.String str3 = split[2];
                if (z17) {
                    str3 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().l(split[0]);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        str3 = split[2];
                    }
                }
                if (z18 && com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n()) {
                    java.lang.String str4 = split[0];
                    java.lang.String str5 = split[1];
                    java.lang.String str6 = split[3];
                    if (str3 == null || str3.length() <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Big5Util", "getStrokesCount buffer is empty");
                        i17 = 0;
                    } else {
                        try {
                            bytes = str3.getBytes("big5");
                        } catch (java.io.UnsupportedEncodingException e17) {
                            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Big5Util", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                        }
                        if (bytes != null && bytes.length >= 2) {
                            int i29 = 0;
                            short s17 = 0;
                            for (int i37 = 2; i29 < i37; i37 = 2) {
                                int i38 = bytes[i29] & 255;
                                i29++;
                                s17 = (short) (i38 | ((short) (s17 << 8)));
                            }
                            i19 = s17 & 65535;
                            if (i19 < 42048 && i19 <= 42049) {
                                i27 = 1;
                            } else if ((i19 < 42050 && i19 <= 42067) || (i19 >= 51520 && i19 <= 51524)) {
                                i18 = 2;
                                i17 = i18;
                            } else if ((i19 < 42068 && i19 <= 42110) || (i19 >= 51525 && i19 <= 51532)) {
                                i27 = 3;
                            } else if ((i19 < 42145 && i19 <= 42237) || (i19 >= 51533 && i19 <= 51548)) {
                                i27 = 4;
                            } else if ((i19 < 42238 && i19 <= 42463) || (i19 >= 51549 && i19 <= 51626)) {
                                i27 = 5;
                            } else if ((i19 < 42464 && i19 <= 42729) || (i19 >= 51627 && i19 <= 51545)) {
                                i27 = 6;
                            } else if ((i19 < 42730 && i19 <= 43202) || (i19 >= 51802 && i19 <= 52144)) {
                                i27 = 7;
                            } else if ((i19 < 43203 && i19 <= 43844) || (i19 >= 52145 && i19 <= 52700)) {
                                i27 = 8;
                            } else if ((i19 < 43845 && i19 <= 44475) || ((i19 >= 52701 && i19 <= 53447) || i19 == 63962)) {
                                i27 = 9;
                            } else if ((i19 < 44476 && i19 <= 45229) || (i19 >= 53448 && i19 <= 54346)) {
                                i27 = 10;
                            } else if ((i19 < 45230 && i19 <= 46018) || (i19 >= 54347 && i19 <= 55376)) {
                                i27 = 11;
                            } else if ((i19 < 46019 && i19 <= 46787) || ((i19 >= 55377 && i19 <= 56496) || i19 == 63963)) {
                                i27 = 12;
                            } else if ((i19 < 46788 && i19 <= 47531) || ((i19 >= 56497 && i19 <= 57583) || (i19 >= 63958 && i19 <= 63960))) {
                                i27 = 13;
                            } else if ((i19 < 47532 && i19 <= 48116) || (i19 >= 57584 && i19 <= 58597)) {
                                i27 = 14;
                            } else if ((i19 < 48117 && i19 <= 48806) || ((i19 >= 58598 && i19 <= 59635) || i19 == 63964)) {
                                i27 = 15;
                            } else if ((i19 < 48807 && i19 <= 49268) || ((i19 >= 59636 && i19 <= 60600) || i19 == 63961)) {
                                i27 = 16;
                            } else if ((i19 < 49269 && i19 <= 49742) || (i19 >= 60601 && i19 <= 61366)) {
                                i27 = 17;
                            } else if ((i19 < 49743 && i19 <= 50014) || (i19 >= 61367 && i19 <= 61930)) {
                                i27 = 18;
                            } else if ((i19 < 50015 && i19 <= 50260) || (i19 >= 61931 && i19 <= 62460)) {
                                i27 = 19;
                            } else if ((i19 < 50261 && i19 <= 50390) || (i19 >= 62461 && i19 <= 62911)) {
                                i27 = 20;
                            } else if ((i19 < 50135 && i19 <= 50538) || (i19 >= 62912 && i19 <= 63189)) {
                                i27 = 21;
                            } else if ((i19 < 50539 && i19 <= 50631) || (i19 >= 63190 && i19 <= 63439)) {
                                i27 = 22;
                            } else if ((i19 < 50632 && i19 <= 50672) || (i19 >= 63440 && i19 <= 63652)) {
                                i27 = 23;
                            } else if ((i19 < 50673 && i19 <= 50772) || (i19 >= 63653 && i19 <= 63725)) {
                                i27 = 24;
                            } else if ((i19 < 50773 && i19 <= 50788) || (i19 >= 63721 && i19 <= 63850)) {
                                i27 = 25;
                            } else if ((i19 < 50789 && i19 <= 50795) || (i19 >= 63906 && i19 <= 63905)) {
                                i27 = 26;
                            } else if ((i19 < 50796 && i19 <= 50805) || (i19 >= 63190 && i19 <= 63929)) {
                                i27 = 27;
                            } else if ((i19 >= 50806 || i19 > 50810) && (i19 < 63930 || i19 > 63941)) {
                                if ((i19 >= 50811 && i19 <= 50814) || (i19 >= 63942 && i19 <= 63957)) {
                                    i27 = 29;
                                }
                                i18 = 0;
                                i17 = i18;
                            } else {
                                i27 = 28;
                            }
                            i18 = i27;
                            i17 = i18;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Big5Util", "byteToShort");
                        i19 = 0;
                        if (i19 < 42048) {
                        }
                        if (i19 < 42050) {
                        }
                        if (i19 < 42068) {
                        }
                        if (i19 < 42145) {
                        }
                        if (i19 < 42238) {
                        }
                        if (i19 < 42464) {
                        }
                        if (i19 < 42730) {
                        }
                        if (i19 < 43203) {
                        }
                        if (i19 < 43845) {
                        }
                        if (i19 < 44476) {
                        }
                        if (i19 < 45230) {
                        }
                        if (i19 < 46019) {
                        }
                        if (i19 < 46788) {
                        }
                        if (i19 < 47532) {
                        }
                        if (i19 < 48117) {
                        }
                        if (i19 < 48807) {
                        }
                        if (i19 < 49269) {
                        }
                        if (i19 < 49743) {
                        }
                        if (i19 < 50015) {
                        }
                        if (i19 < 50261) {
                        }
                        if (i19 < 50135) {
                        }
                        if (i19 < 50539) {
                        }
                        if (i19 < 50632) {
                        }
                        if (i19 < 50673) {
                        }
                        if (i19 < 50773) {
                        }
                        if (i19 < 50789) {
                        }
                        if (i19 < 50796) {
                        }
                        if (i19 >= 50806) {
                        }
                        if (i19 >= 50811) {
                            i27 = 29;
                            i18 = i27;
                            i17 = i18;
                        }
                        i27 = 29;
                        i18 = i27;
                        i17 = i18;
                    }
                    aVar = new u11.a(str4, str5, str3, str6, i17);
                } else {
                    java.lang.String str7 = split[0];
                    java.lang.String str8 = split[1];
                    java.lang.String str9 = split[3];
                    aVar = new u11.a(str7, str8, str3, str9, str9.charAt(0));
                }
                u11.a aVar2 = aVar;
                hashMap.put(aVar2.f505260a + aVar2.f505261b, aVar2);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.b()) {
            u11.a aVar3 = (u11.a) hashMap.get("US1");
            hashMap = new java.util.HashMap();
            hashMap.put("US1", aVar3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CountryCodeUtil", "initCacheMapCountryCode cost %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return hashMap;
    }
}
