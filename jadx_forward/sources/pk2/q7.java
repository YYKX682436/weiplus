package pk2;

/* loaded from: classes3.dex */
public final class q7 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437728h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437729i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437728h = helper.R;
        this.f437729i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        java.util.HashMap hashMap = new java.util.HashMap();
        df2.cn cnVar = (df2.cn) o9Var.e(df2.cn.class);
        hashMap.put("friend_wx_username", cnVar != null ? cnVar.o7() : "");
        df2.cn cnVar2 = (df2.cn) o9Var.e(df2.cn.class);
        boolean z17 = false;
        hashMap.put("style_type", java.lang.String.valueOf((cnVar2 != null ? cnVar2.C : 0) + 1));
        pk2.f8.f437280a.c(7, !E() ? 2 : 8, hashMap);
        df2.cn cnVar3 = (df2.cn) this.f445960a.e(df2.cn.class);
        if (cnVar3 != null) {
            df2.cn D = D();
            if (D != null && !D.p7()) {
                z17 = true;
            }
            cnVar3.t7(121, 30, java.lang.Integer.valueOf(z17 ? 1 : 2));
        }
        df2.cn D2 = D();
        if (D2 != null) {
            D2.r7(!E(), r45.wg7.MMFinderLiveLikeSource_ForwardRealnameLikeButton, true);
        }
    }

    public final df2.cn D() {
        pk2.g8 g8Var;
        pk2.d9 d9Var = this.f445960a.f437615f;
        if (d9Var == null || (g8Var = d9Var.f437191a) == null) {
            return null;
        }
        return (df2.cn) ((pk2.k9) g8Var).f437457a.m56789x25fe639c(df2.cn.class);
    }

    public final boolean E() {
        pk2.g8 g8Var;
        df2.cn cnVar;
        pk2.d9 d9Var = this.f445960a.f437615f;
        if (d9Var == null || (g8Var = d9Var.f437191a) == null || (cnVar = (df2.cn) ((pk2.k9) g8Var).f437457a.m56789x25fe639c(df2.cn.class)) == null) {
            return false;
        }
        return cnVar.p7();
    }

    public final boolean F() {
        df2.cn D = D();
        if (D != null) {
            return D.D;
        }
        return false;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437729i;
    }

    @Override // qk2.f
    public boolean o() {
        df2.cn D = D();
        if (D != null) {
            return D.B;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    @Override // qk2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(pk2.o9 r17, db5.g4 r18) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.q7.v(pk2.o9, db5.g4):void");
    }

    @Override // qk2.h
    public int y() {
        return this.f437728h;
    }
}
