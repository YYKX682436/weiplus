package bg;

/* loaded from: classes7.dex */
public class u0 implements dg.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f101371a;

    public u0(bg.f fVar) {
        this.f101371a = fVar;
    }

    @Override // dg.c
    public void a(java.lang.String str, int i17, int i18) {
        bg.f fVar = this.f101371a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(fVar.A(), "send video error event, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (fVar.U()) {
            fg1.b0 b0Var = (fg1.b0) fVar.f101298i;
            b0Var.k();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fg1.d0(b0Var));
            try {
                org.json.JSONObject b17 = b0Var.b();
                b17.put("errMsg", java.lang.String.format(java.util.Locale.US, "%s(%d,%d)", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
                b0Var.a(new fg1.g0(null), b17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoError fail", e17);
            }
            b0Var.c(true);
            tf.m0 m0Var = b0Var.f343383i;
            if (m0Var != null) {
                m0Var.a();
            }
        }
        dg.b bVar = fVar.f101306q;
        if (bVar != null) {
            ye1.e eVar = fVar.f101297h;
            fg1.z zVar = (fg1.z) bVar;
            dg.f b18 = zVar.b();
            ig1.a aVar = zVar.f343455c;
            aVar.getClass();
            if (eVar != null && b18 != null) {
                fg1.q0 q0Var = (fg1.q0) b18;
                q0Var.a(1234L, 65L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoError, what:%s, extra:%s, msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (oe1.x1.c(eVar)) {
                    q0Var.a(1234L, 75L, 1L, false);
                } else if (aVar.b(eVar)) {
                    q0Var.a(1234L, 109L, 1L, false);
                } else if (oe1.x1.d(eVar)) {
                    q0Var.a(1234L, 70L, 1L, false);
                }
                if (!oe1.x1.d(eVar)) {
                    ye1.d a17 = aVar.a(i17, i18);
                    if (a17 != null) {
                        switch (a17.ordinal()) {
                            case 0:
                                if (!oe1.x1.c(eVar)) {
                                    if (aVar.b(eVar)) {
                                        q0Var.a(1234L, 125L, 1L, false);
                                        break;
                                    }
                                } else {
                                    q0Var.a(1234L, 116L, 1L, false);
                                    break;
                                }
                                break;
                            case 1:
                                if (!oe1.x1.c(eVar)) {
                                    if (aVar.b(eVar)) {
                                        q0Var.a(1234L, 126L, 1L, false);
                                        break;
                                    }
                                } else {
                                    q0Var.a(1234L, 117L, 1L, false);
                                    break;
                                }
                                break;
                            case 2:
                                if (!oe1.x1.c(eVar)) {
                                    if (aVar.b(eVar)) {
                                        q0Var.a(1234L, 127L, 1L, false);
                                        break;
                                    }
                                } else {
                                    q0Var.a(1234L, 118L, 1L, false);
                                    break;
                                }
                                break;
                            case 3:
                                if (!oe1.x1.c(eVar)) {
                                    if (aVar.b(eVar)) {
                                        q0Var.a(1234L, 128L, 1L, false);
                                        break;
                                    }
                                } else {
                                    q0Var.a(1234L, 119L, 1L, false);
                                    break;
                                }
                                break;
                            case 4:
                                if (!oe1.x1.c(eVar)) {
                                    if (aVar.b(eVar)) {
                                        q0Var.a(1234L, 129L, 1L, false);
                                        break;
                                    }
                                } else {
                                    q0Var.a(1234L, 120L, 1L, false);
                                    break;
                                }
                                break;
                            case 5:
                                if (!oe1.x1.c(eVar)) {
                                    if (aVar.b(eVar)) {
                                        q0Var.a(1234L, 130L, 1L, false);
                                        break;
                                    }
                                } else {
                                    q0Var.a(1234L, 121L, 1L, false);
                                    break;
                                }
                                break;
                            case 6:
                                if (!oe1.x1.c(eVar)) {
                                    if (aVar.b(eVar)) {
                                        q0Var.a(1234L, 131L, 1L, false);
                                        break;
                                    }
                                } else {
                                    q0Var.a(1234L, 122L, 1L, false);
                                    break;
                                }
                                break;
                            case 7:
                                if (!oe1.x1.c(eVar)) {
                                    if (aVar.b(eVar)) {
                                        q0Var.a(1234L, 132L, 1L, false);
                                        break;
                                    }
                                } else {
                                    q0Var.a(1234L, 123L, 1L, false);
                                    break;
                                }
                                break;
                        }
                    }
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    if (str.equalsIgnoreCase("MEDIA_ERR_NETWORK")) {
                        q0Var.a(1234L, 72L, 1L, false);
                    } else if (str.equalsIgnoreCase("MEDIA_ERR_DECODE")) {
                        q0Var.a(1234L, 73L, 1L, false);
                    } else if (str.equalsIgnoreCase("MEDIA_ERR_SRC_NOT_SUPPORTED")) {
                        q0Var.a(1234L, 71L, 1L, false);
                    } else {
                        q0Var.a(1234L, 74L, 1L, false);
                    }
                }
                ig1.c cVar = aVar.f372874a;
                cVar.f372890o = i17;
                cVar.f372891p = i18;
                cVar.f372892q = str;
            }
        }
        if (fVar.f101302o != null) {
            if (!oe1.x1.d(fVar.f101297h)) {
                ((fg1.q0) fVar.f101302o).a(928L, 42L, 1L, false);
            } else if (i17 == -1024) {
                ((fg1.q0) fVar.f101302o).a(928L, -i18, 1L, false);
                ((fg1.q0) fVar.f101302o).a(928L, 0L, 1L, false);
            } else {
                ((fg1.q0) fVar.f101302o).a(928L, 41L, 1L, false);
            }
        }
        fVar.W();
    }
}
