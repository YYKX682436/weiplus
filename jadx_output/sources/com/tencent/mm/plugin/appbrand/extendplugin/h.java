package com.tencent.mm.plugin.appbrand.extendplugin;

/* loaded from: classes7.dex */
public class h implements eg.c {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.extendplugin.h f78035d;

    @Override // eg.c
    public eg.b Ua(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1367751899:
                if (str.equals("camera")) {
                    c17 = 0;
                    break;
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    c17 = 1;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1693182669:
                if (str.equals("liveplayer")) {
                    c17 = 3;
                    break;
                }
                break;
            case 1702014259:
                if (str.equals("livepusher")) {
                    c17 = 4;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return new uf1.a();
            case 1:
                return new dg1.g();
            case 2:
                bg.f fVar = new bg.f(false, null);
                fVar.F(new fg1.z());
                return fVar;
            case 3:
                wf.b bVar = new wf.b();
                bVar.f445421o = new yf1.e();
                bVar.f445420n = new yf1.k();
                bVar.f445419m = new xf1.g();
                ((yf1.e) bVar.f445421o).f461638a = bVar;
                return bVar;
            case 4:
                yf.i0 i0Var = new yf.i0();
                i0Var.f461365o = new bg1.h();
                i0Var.f461364n = new bg1.q();
                i0Var.f461363m = new xf1.g();
                ((bg1.h) i0Var.f461365o).f19898i = i0Var;
                return i0Var;
            default:
                return null;
        }
    }
}
