package xs2;

/* loaded from: classes10.dex */
public final class e0 {
    public e0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final xs2.f0 a(boolean z17, mm2.y1 y1Var, int i17) {
        if (y1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveDanmakuConfig", "createLiveDanmakuConfig fail,baseConfig is null!");
            return null;
        }
        int ordinal = y1Var.f411085a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return z17 ? new xs2.f0(xs2.x.f537926a, new xs2.y(), b(y1Var, ((java.lang.Number) ((jz5.n) xs2.f0.f537856e).mo141623x754a37bb()).intValue(), i17)) : new xs2.f0(xs2.z.f537929a, new xs2.a0(), b(y1Var, ((java.lang.Number) ((jz5.n) xs2.f0.f537856e).mo141623x754a37bb()).intValue(), i17));
            }
            throw new jz5.j();
        }
        if (!z17) {
            return null;
        }
        xs2.v vVar = xs2.v.f537923a;
        xs2.w wVar = new xs2.w();
        xp.a aVar = new xp.a();
        aVar.f537336a = i17;
        aVar.f537337b = i17;
        aVar.f537338c = 6500;
        aVar.f537339d = 12000;
        aVar.f537340e = 0;
        aVar.f537341f = 0;
        aVar.f537346k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
        aVar.f537344i = 1;
        aVar.f537354s = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        aVar.f537355t = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        return new xs2.f0(vVar, wVar, aVar);
    }

    public final xp.a b(mm2.y1 y1Var, int i17, int i18) {
        jz5.o oVar;
        float f17;
        xp.a aVar = new xp.a();
        xs2.e0 e0Var = xs2.f0.f537855d;
        mm2.b2 range = y1Var.f411087c.f411132a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
        int i19 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        int dimensionPixelOffset = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int dimensionPixelOffset2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimensionPixelOffset3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        int floor = (int) java.lang.Math.floor((i19 - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7)) / (dimensionPixelOffset3 + dimensionPixelOffset2));
        if (floor < 3) {
            floor = 3;
        }
        int i27 = ((i19 - (dimensionPixelOffset - dimensionPixelOffset2)) - (floor * dimensionPixelOffset3)) / floor;
        if (i27 >= dimensionPixelOffset2) {
            dimensionPixelOffset2 = i27;
        }
        int i28 = dimensionPixelOffset3 + dimensionPixelOffset2;
        int ordinal = range.ordinal();
        if (ordinal == 0) {
            int i29 = dimensionPixelOffset2 / 2;
            oVar = new jz5.o(3, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(dimensionPixelOffset - i29));
        } else if (ordinal == 1) {
            int ceil = (int) java.lang.Math.ceil(((i19 / 2.0f) - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn)) / i28);
            int i37 = dimensionPixelOffset2 / 2;
            oVar = new jz5.o(java.lang.Integer.valueOf(ceil >= 3 ? ceil : 3), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(dimensionPixelOffset - i37));
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            int i38 = dimensionPixelOffset2 / 2;
            oVar = new jz5.o(java.lang.Integer.valueOf(floor), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(dimensionPixelOffset - i38));
        }
        aVar.f537336a = i18;
        aVar.f537337b = ((java.lang.Number) oVar.f384374d).intValue();
        aVar.f537338c = 6500;
        mm2.c2 c2Var = y1Var.f411088d;
        aVar.f537339d = c2Var.f410463a;
        aVar.f537340e = c2Var.f410464b;
        aVar.f537341f = 0;
        aVar.f537346k = ((java.lang.Number) oVar.f384375e).intValue();
        aVar.f537345j = ((java.lang.Number) oVar.f384376f).intValue();
        mm2.d2 trans = y1Var.f411087c.f411133b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trans, "trans");
        int ordinal2 = trans.ordinal();
        if (ordinal2 == 0) {
            f17 = 1.0f;
        } else if (ordinal2 == 1) {
            f17 = 0.8f;
        } else {
            if (ordinal2 != 2) {
                throw new jz5.j();
            }
            f17 = 0.5f;
        }
        aVar.f537343h = f17;
        aVar.f537344i = i17;
        aVar.f537347l = true;
        aVar.f537348m = true;
        aVar.f537349n = true;
        ae2.in inVar = ae2.in.f85221a;
        aVar.f537350o = ((java.lang.Number) ae2.in.I3.r()).intValue() == 1;
        aVar.f537351p = ((java.lang.Boolean) ((jz5.n) xs2.f0.f537857f).mo141623x754a37bb()).booleanValue();
        aVar.f537352q = ((java.lang.Boolean) ((jz5.n) xs2.f0.f537858g).mo141623x754a37bb()).booleanValue();
        aVar.f537353r = true;
        aVar.f537354s = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        aVar.f537355t = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        return aVar;
    }
}
