package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441;

/* renamed from: com.google.android.gms.common.server.response.FastJsonResponse */
/* loaded from: classes13.dex */
public abstract class AbstractC1975xf0edc3e5 {

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter */
    /* loaded from: classes13.dex */
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        java.lang.Object zac(java.lang.Object obj);

        java.lang.Object zad(java.lang.Object obj);
    }

    public static final java.lang.Object zaD(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.Object obj) {
        return field.zak != null ? field.zaf(obj) : obj;
    }

    private final void zaE(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.Object obj) {
        int i17 = field.zac;
        java.lang.Object zae = field.zae(obj);
        java.lang.String str = field.zae;
        switch (i17) {
            case 0:
                if (zae != null) {
                    mo17365x9549f959(field, str, ((java.lang.Integer) zae).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(field, str, (java.math.BigInteger) zae);
                return;
            case 2:
                if (zae != null) {
                    mo18462x2a4842db(field, str, ((java.lang.Long) zae).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new java.lang.IllegalStateException("Unsupported type for conversion: " + i17);
            case 4:
                if (zae != null) {
                    zan(field, str, ((java.lang.Double) zae).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(field, str, (java.math.BigDecimal) zae);
                return;
            case 6:
                if (zae != null) {
                    mo18461x43735a43(field, str, ((java.lang.Boolean) zae).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                mo17362x84691ef0(field, str, (java.lang.String) zae);
                return;
            case 8:
            case 9:
                if (zae != null) {
                    mo17364x4ac0c734(field, str, (byte[]) zae);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(java.lang.StringBuilder sb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.Object obj) {
        int i17 = field.zaa;
        if (i17 == 11) {
            java.lang.Class cls = field.zag;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(cls);
            sb6.append(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5) cls.cast(obj)).mo18464x9616526c());
        } else {
            if (i17 != 7) {
                sb6.append(obj);
                return;
            }
            sb6.append("\"");
            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2002x365c2489.m18589x77baa7f2((java.lang.String) obj));
            sb6.append("\"");
        }
    }

    private static final void zaG(java.lang.String str) {
        android.util.Log.isLoggable("FastJsonResponse", 6);
    }

    /* renamed from: addConcreteTypeArrayInternal */
    public <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5> void mo17354x74407976(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        throw new java.lang.UnsupportedOperationException("Concrete type array not supported");
    }

    /* renamed from: addConcreteTypeInternal */
    public <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5> void mo17355xcd78397d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, T t17) {
        throw new java.lang.UnsupportedOperationException("Concrete type not supported");
    }

    /* renamed from: getFieldMappings */
    public abstract java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> mo17356xb4d428c9();

    /* renamed from: getFieldValue */
    public java.lang.Object mo17357x101b448d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        java.lang.String str = field.zae;
        if (field.zag == null) {
            return mo18459x7d17ceda(str);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18222xe071d469(mo18459x7d17ceda(str) == null, "Concrete field shouldn't be value object: %s", field.zae);
        try {
            return getClass().getMethod("get" + java.lang.Character.toUpperCase(str.charAt(0)) + str.substring(1), new java.lang.Class[0]).invoke(this, new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: getValueObject */
    public abstract java.lang.Object mo18459x7d17ceda(java.lang.String str);

    /* renamed from: isFieldSet */
    public boolean mo17358x9957f052(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        if (field.zac != 11) {
            return mo18460x9e40cf05(field.zae);
        }
        if (field.zad) {
            throw new java.lang.UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new java.lang.UnsupportedOperationException("Concrete types not supported");
    }

    /* renamed from: isPrimitiveFieldSet */
    public abstract boolean mo18460x9e40cf05(java.lang.String str);

    /* renamed from: setBooleanInternal */
    public void mo18461x43735a43(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, boolean z17) {
        throw new java.lang.UnsupportedOperationException("Boolean not supported");
    }

    /* renamed from: setDecodedBytesInternal */
    public void mo17364x4ac0c734(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        throw new java.lang.UnsupportedOperationException("byte[] not supported");
    }

    /* renamed from: setIntegerInternal */
    public void mo17365x9549f959(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, int i17) {
        throw new java.lang.UnsupportedOperationException("Integer not supported");
    }

    /* renamed from: setLongInternal */
    public void mo18462x2a4842db(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, long j17) {
        throw new java.lang.UnsupportedOperationException("Long not supported");
    }

    /* renamed from: setStringInternal */
    public void mo17362x84691ef0(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException("String not supported");
    }

    /* renamed from: setStringMapInternal */
    public void mo18463x3a0d8b26(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        throw new java.lang.UnsupportedOperationException("String map not supported");
    }

    /* renamed from: setStringsInternal */
    public void mo17360x33e7969d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        throw new java.lang.UnsupportedOperationException("String list not supported");
    }

    /* renamed from: toString */
    public java.lang.String mo18464x9616526c() {
        java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> mo17356xb4d428c9 = mo17356xb4d428c9();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(100);
        for (java.lang.String str : mo17356xb4d428c9.keySet()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field = mo17356xb4d428c9.get(str);
            if (mo17358x9957f052(field)) {
                java.lang.Object zaD = zaD(field, mo17357x101b448d(field));
                if (sb6.length() == 0) {
                    sb6.append("{");
                } else {
                    sb6.append(",");
                }
                sb6.append("\"");
                sb6.append(str);
                sb6.append("\":");
                if (zaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb6.append("\"");
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1988xf8f2482.m18528xb2963e16((byte[]) zaD));
                            sb6.append("\"");
                            break;
                        case 9:
                            sb6.append("\"");
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1988xf8f2482.m18529x27f51ea6((byte[]) zaD));
                            sb6.append("\"");
                            break;
                        case 10:
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2003xdf9d8d5.m18591x3956df8f(sb6, (java.util.HashMap) zaD);
                            break;
                        default:
                            if (field.zab) {
                                java.util.ArrayList arrayList = (java.util.ArrayList) zaD;
                                sb6.append("[");
                                int size = arrayList.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    if (i17 > 0) {
                                        sb6.append(",");
                                    }
                                    java.lang.Object obj = arrayList.get(i17);
                                    if (obj != null) {
                                        zaF(sb6, field, obj);
                                    }
                                }
                                sb6.append("]");
                                break;
                            } else {
                                zaF(sb6, field, zaD);
                                break;
                            }
                    }
                } else {
                    sb6.append("null");
                }
            }
        }
        if (sb6.length() > 0) {
            sb6.append("}");
        } else {
            sb6.append("{}");
        }
        return sb6.toString();
    }

    public final void zaA(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str) {
        if (field.zak != null) {
            zaE(field, str);
        } else {
            mo17362x84691ef0(field, field.zae, str);
        }
    }

    public final void zaB(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.util.Map map) {
        if (field.zak != null) {
            zaE(field, map);
        } else {
            mo18463x3a0d8b26(field, field.zae, map);
        }
    }

    public final void zaC(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            mo17360x33e7969d(field, field.zae, arrayList);
        }
    }

    public final void zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.math.BigDecimal bigDecimal) {
        if (field.zak != null) {
            zaE(field, bigDecimal);
        } else {
            zab(field, field.zae, bigDecimal);
        }
    }

    public void zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.math.BigDecimal bigDecimal) {
        throw new java.lang.UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    public void zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.math.BigInteger bigInteger) {
        if (field.zak != null) {
            zaE(field, bigInteger);
        } else {
            zaf(field, field.zae, bigInteger);
        }
    }

    public void zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.math.BigInteger bigInteger) {
        throw new java.lang.UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zah(field, field.zae, arrayList);
        }
    }

    public void zah(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, boolean z17) {
        if (field.zak != null) {
            zaE(field, java.lang.Boolean.valueOf(z17));
        } else {
            mo18461x43735a43(field, field.zae, z17);
        }
    }

    public final void zaj(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zak(field, field.zae, arrayList);
        }
    }

    public void zak(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, byte[] bArr) {
        if (field.zak != null) {
            zaE(field, bArr);
        } else {
            mo17364x4ac0c734(field, field.zae, bArr);
        }
    }

    public final void zam(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, double d17) {
        if (field.zak != null) {
            zaE(field, java.lang.Double.valueOf(d17));
        } else {
            zan(field, field.zae, d17);
        }
    }

    public void zan(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, double d17) {
        throw new java.lang.UnsupportedOperationException("Double not supported");
    }

    public final void zao(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zap(field, field.zae, arrayList);
        }
    }

    public void zap(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, float f17) {
        if (field.zak != null) {
            zaE(field, java.lang.Float.valueOf(f17));
        } else {
            zar(field, field.zae, f17);
        }
    }

    public void zar(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, float f17) {
        throw new java.lang.UnsupportedOperationException("Float not supported");
    }

    public final void zas(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zat(field, field.zae, arrayList);
        }
    }

    public void zat(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("Float list not supported");
    }

    public final void zau(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, int i17) {
        if (field.zak != null) {
            zaE(field, java.lang.Integer.valueOf(i17));
        } else {
            mo17365x9549f959(field, field.zae, i17);
        }
    }

    public final void zav(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaw(field, field.zae, arrayList);
        }
    }

    public void zaw(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, long j17) {
        if (field.zak != null) {
            zaE(field, java.lang.Long.valueOf(j17));
        } else {
            mo18462x2a4842db(field, field.zae, j17);
        }
    }

    public final void zay(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    public void zaz(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("Long list not supported");
    }

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$Field */
    /* loaded from: classes13.dex */
    public static class Field<I, O> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

        /* renamed from: CREATOR */
        public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zaj f5988x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zaj();
        protected final int zaa;
        protected final boolean zab;
        protected final int zac;
        protected final boolean zad;
        protected final java.lang.String zae;
        protected final int zaf;
        protected final java.lang.Class zag;
        protected final java.lang.String zah;
        private final int zai;
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan zaj;
        private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter zak;

        public Field(int i17, int i18, boolean z17, int i19, boolean z18, java.lang.String str, int i27, java.lang.String str2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zaa zaaVar) {
            this.zai = i17;
            this.zaa = i18;
            this.zab = z17;
            this.zac = i19;
            this.zad = z18;
            this.zae = str;
            this.zaf = i27;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1978x7343ec77.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.zab();
            }
        }

        /* renamed from: forBase64 */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<byte[], byte[]> m18466x22999b78(java.lang.String str, int i17) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(8, false, 8, false, str, i17, null, null);
        }

        /* renamed from: forBoolean */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<java.lang.Boolean, java.lang.Boolean> m18467x4849331f(java.lang.String str, int i17) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(6, false, 6, false, str, i17, null, null);
        }

        /* renamed from: forConcreteType */
        public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<T, T> m18468xc061c6c8(java.lang.String str, int i17, java.lang.Class<T> cls) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(11, false, 11, false, str, i17, cls, null);
        }

        /* renamed from: forConcreteTypeArray */
        public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<java.util.ArrayList<T>, java.util.ArrayList<T>> m18469x8cdcb871(java.lang.String str, int i17, java.lang.Class<T> cls) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(11, true, 11, true, str, i17, cls, null);
        }

        /* renamed from: forDouble */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<java.lang.Double, java.lang.Double> m18470x26c979fa(java.lang.String str, int i17) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(4, false, 4, false, str, i17, null, null);
        }

        /* renamed from: forFloat */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<java.lang.Float, java.lang.Float> m18471x1a213b13(java.lang.String str, int i17) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(3, false, 3, false, str, i17, null, null);
        }

        /* renamed from: forInteger */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<java.lang.Integer, java.lang.Integer> m18472xb9234835(java.lang.String str, int i17) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(0, false, 0, false, str, i17, null, null);
        }

        /* renamed from: forLong */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<java.lang.Long, java.lang.Long> m18473xd7903ae5(java.lang.String str, int i17) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(2, false, 2, false, str, i17, null, null);
        }

        /* renamed from: forString */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<java.lang.String, java.lang.String> m18474x40a75e3a(java.lang.String str, int i17) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(7, false, 7, false, str, i17, null, null);
        }

        /* renamed from: forStringMap */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, java.lang.String>> m18475xd4cf6cc2(java.lang.String str, int i17) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(10, false, 10, false, str, i17, null, null);
        }

        /* renamed from: forStrings */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> m18476xd4446979(java.lang.String str, int i17) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<>(7, true, 7, true, str, i17, null, null);
        }

        /* renamed from: withConverter */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field m18477x1ed5777a(java.lang.String str, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter<?, ?> fieldConverter, boolean z17) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field(7, z17, 0, false, str, i17, null, fieldConverter);
        }

        /* renamed from: getSafeParcelableFieldId */
        public int m18478x1fb0b8f() {
            return this.zaf;
        }

        /* renamed from: toString */
        public final java.lang.String m18479x9616526c() {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.ToStringHelper add = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18191xbe50cd3a(this).add(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5, java.lang.Integer.valueOf(this.zai)).add("typeIn", java.lang.Integer.valueOf(this.zaa)).add("typeInArray", java.lang.Boolean.valueOf(this.zab)).add("typeOut", java.lang.Integer.valueOf(this.zac)).add("typeOutArray", java.lang.Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", java.lang.Integer.valueOf(this.zaf)).add("concreteTypeName", zag());
            java.lang.Class cls = this.zag;
            if (cls != null) {
                add.add("concreteType.class", cls.getCanonicalName());
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                add.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return add.m18192x9616526c();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i17) {
            int i18 = this.zai;
            int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, i18);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 2, this.zaa);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 3, this.zab);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 4, this.zac);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 5, this.zad);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 6, this.zae, false);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 7, m18478x1fb0b8f());
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 8, zag(), false);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 9, zaa(), i17, false);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
        }

        public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zaa zaa() {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p214xeb2789a0.zaa.zaa(fieldConverter);
        }

        public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field zab() {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
        }

        public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5 zad() {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zag);
            java.lang.Class cls = this.zag;
            if (cls != com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1978x7343ec77.class) {
                return (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5) cls.newInstance();
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zah);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1978x7343ec77(this.zaj, this.zah);
        }

        public final java.lang.Object zae(java.lang.Object obj) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zak);
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zak.zac(obj));
        }

        public final java.lang.Object zaf(java.lang.Object obj) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zak);
            return this.zak.zad(obj);
        }

        public final java.lang.String zag() {
            java.lang.String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final java.util.Map zah() {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zah);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zaj);
            return (java.util.Map) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zaj.zab(this.zah));
        }

        public final void zai(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan zanVar) {
            this.zaj = zanVar;
        }

        public final boolean zaj() {
            return this.zak != null;
        }

        public Field(int i17, boolean z17, int i18, boolean z18, java.lang.String str, int i19, java.lang.Class cls, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.FieldConverter fieldConverter) {
            this.zai = 1;
            this.zaa = i17;
            this.zab = z17;
            this.zac = i18;
            this.zad = z18;
            this.zae = str;
            this.zaf = i19;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
        }
    }
}
