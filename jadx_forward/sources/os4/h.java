package os4;

/* loaded from: classes8.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static long f429812a;

    public static final void a(android.content.Context context, r45.ma5 ma5Var, ms4.b bVar) {
        if (ma5Var != null) {
            int i17 = ma5Var.f461840e;
            if (i17 == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", ma5Var.f461841f);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(context, intent);
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(ma5Var.f461842g, ma5Var.f461843h, 0, 1188);
            }
            if (bVar != null) {
                bVar.a(ma5Var);
            }
        }
    }

    public static final void b(android.widget.TextView textView, java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        textView.setText(text);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.p(textView, 1, false, null));
        textView.setClickable(true);
        textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
    }

    public static final double c(java.lang.String d17, java.lang.String d27, int i17) {
        java.lang.String obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "d1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d27, "d2");
        try {
            int length = d17.length() - 1;
            int i18 = 0;
            boolean z17 = false;
            while (i18 <= length) {
                boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(d17.charAt(!z17 ? i18 : length), 32) <= 0;
                if (z17) {
                    if (!z18) {
                        break;
                    }
                    length--;
                } else if (z18) {
                    i18++;
                } else {
                    z17 = true;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(d17.subSequence(i18, length + 1).toString(), 0.0d) == 0.0d) {
                obj = "0";
            } else {
                int length2 = d17.length() - 1;
                int i19 = 0;
                boolean z19 = false;
                while (i19 <= length2) {
                    boolean z27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(d17.charAt(!z19 ? i19 : length2), 32) <= 0;
                    if (z19) {
                        if (!z27) {
                            break;
                        }
                        length2--;
                    } else if (z27) {
                        i19++;
                    } else {
                        z19 = true;
                    }
                }
                obj = d17.subSequence(i19, length2 + 1).toString();
            }
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(obj);
            int length3 = d27.length() - 1;
            int i27 = 0;
            boolean z28 = false;
            while (i27 <= length3) {
                boolean z29 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(d27.charAt(!z28 ? i27 : length3), 32) <= 0;
                if (z28) {
                    if (!z29) {
                        break;
                    }
                    length3--;
                } else if (z29) {
                    i27++;
                } else {
                    z28 = true;
                }
            }
            return bigDecimal.divide(new java.math.BigDecimal(d27.subSequence(i27, length3 + 1).toString()), 5, i17).doubleValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeCoinUtils", e17, "", new java.lang.Object[0]);
            return 0.0d;
        }
    }

    public static final int d(int i17) {
        switch (i17) {
            case 0:
                return 2;
            case 1:
            case 2:
                return 1;
            case 3:
            case 4:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return 1 + js4.s.a(i17);
            case 5:
            case 7:
            default:
                return -1;
        }
    }

    public static final void e(android.content.Context context, ms4.a aVar, android.content.DialogInterface.OnClickListener onClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (aVar != null) {
            if (aVar.f412528a == 0 && aVar.f412529b == 0) {
                return;
            }
            java.lang.String str = aVar.f412530c;
            if (str == null || str.length() == 0) {
                db5.e1.E(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9p), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9_), false, onClickListener);
            } else {
                db5.e1.E(context, aVar.f412530c, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9_), false, onClickListener);
            }
        }
    }

    public static final void f(android.content.Context context, r45.f04 f04Var, ms4.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (f04Var != null) {
            int i17 = f04Var.f455443g;
            if (i17 == 1) {
                db5.e1.E(context, f04Var.f455440d, "", f04Var.f455441e.f461839d, false, new os4.c(context, f04Var, bVar));
            } else {
                if (i17 != 2) {
                    return;
                }
                db5.e1.C(context, f04Var.f455440d, "", f04Var.f455442f.f461839d, f04Var.f455441e.f461839d, false, new os4.d(context, f04Var, bVar), new os4.e(context, f04Var, bVar));
            }
        }
    }

    public static final boolean g(com.p314xaae8f345.mm.p944x882e457a.f callback) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        return (callback.f152148a == 0 && callback.f152149b == 0 && (fVar = callback.f152151d) != null && ((r45.js5) fVar).f76492x92037252 != null && ((r45.js5) fVar).f76492x92037252.f458492d == 0) ? false : true;
    }

    public static final boolean h(com.p314xaae8f345.mm.p944x882e457a.f callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        return (callback.f152148a == 0 && callback.f152149b == 0) ? false : true;
    }

    public static final long i() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WECOIN_BALANCE_LONG_SYNC, 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
        return ((java.lang.Long) m17).longValue();
    }

    public static final int j(java.lang.String d17, java.lang.String d27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "d1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d27, "d2");
        try {
            double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(d17, 0.0d);
            double F2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(d27, 0.0d);
            boolean z17 = true;
            if (F == 0.0d) {
                d17 = "0";
            }
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(d17);
            if (F2 != 0.0d) {
                z17 = false;
            }
            if (z17) {
                d27 = "0";
            }
            return bigDecimal.multiply(new java.math.BigDecimal(d27)).intValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeCoinUtils", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    public static final void k(java.lang.String tag, com.p314xaae8f345.mm.p2495xc50a8b8b.f originObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originObj, "originObj");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject = pm0.b0.b(originObj);
        } catch (java.lang.Exception e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("printPbLog account exception, error: ");
            sb6.append(e17.getMessage());
            sb6.append(", stack trace: ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCoinUtils", sb6.toString());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, jSONObject2);
    }

    public static final void l(long j17) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WECOIN_BALANCE_LONG_SYNC, java.lang.Long.valueOf(j17));
    }

    public static final void m(android.widget.TextView textView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        textView.setTextSize(1, i17);
    }
}
