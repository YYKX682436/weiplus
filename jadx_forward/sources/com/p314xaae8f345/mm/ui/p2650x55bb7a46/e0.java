package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public class e0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f281982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f281983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281984g;

    public e0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6, java.lang.String str, java.util.List list, java.util.List list2, java.lang.String str2) {
        this.f281981d = str;
        this.f281982e = list;
        this.f281983f = list2;
        this.f281984g = str2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String str = this.f281981d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            g4Var.setHeaderTitle(str);
        }
        int i17 = 0;
        while (true) {
            java.util.List list = this.f281982e;
            if (i17 >= list.size()) {
                break;
            }
            g4Var.f(((java.lang.Integer) this.f281983f.get(i17)).intValue(), (java.lang.CharSequence) list.get(i17));
            i17++;
        }
        java.lang.String str2 = this.f281984g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        g4Var.f(-1, str2);
    }
}
