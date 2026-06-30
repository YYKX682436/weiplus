package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd;

/* loaded from: classes7.dex */
public class h implements eg.c {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.h f159568d;

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
                bVar.f526954o = new yf1.e();
                bVar.f526953n = new yf1.k();
                bVar.f526952m = new xf1.g();
                ((yf1.e) bVar.f526954o).f543171a = bVar;
                return bVar;
            case 4:
                yf.i0 i0Var = new yf.i0();
                i0Var.f542898o = new bg1.h();
                i0Var.f542897n = new bg1.q();
                i0Var.f542896m = new xf1.g();
                ((bg1.h) i0Var.f542898o).f101431i = i0Var;
                return i0Var;
            default:
                return null;
        }
    }
}
