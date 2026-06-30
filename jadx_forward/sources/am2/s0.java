package am2;

/* loaded from: classes10.dex */
public final class s0 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f90273e;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f90274a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f90275b;

    /* renamed from: c, reason: collision with root package name */
    public final pk2.o9 f90276c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f90277d;

    public s0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, gk2.e liveData, pk2.o9 helper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f90274a = activity;
        this.f90275b = liveData;
        this.f90276c = helper;
        new java.util.LinkedList();
        this.f90277d = new java.util.ArrayList();
    }

    public final void a(r45.ja0 ja0Var, java.lang.String str, int i17, long j17, long j18) {
        ja0Var.set(6, java.lang.Boolean.TRUE);
        ja0Var.set(11, str);
        java.util.LinkedList m75941xfb821914 = ja0Var.m75941xfb821914(4);
        r45.zh5 zh5Var = new r45.zh5();
        zh5Var.set(0, java.lang.Integer.valueOf(i17));
        zh5Var.set(1, java.lang.Long.valueOf(j17));
        zh5Var.set(2, java.lang.Long.valueOf(j18));
        zh5Var.set(3, "MMFinderLiveGift100001");
        r45.zh5 zh5Var2 = new r45.zh5();
        zh5Var2.set(0, java.lang.Integer.valueOf(i17));
        zh5Var2.set(1, java.lang.Long.valueOf(j17 + 5));
        zh5Var2.set(2, java.lang.Long.valueOf(j18));
        zh5Var2.set(3, "findercoin_5_14171197588311115892");
        m75941xfb821914.addAll(kz5.c0.i(zh5Var, zh5Var2));
        java.util.LinkedList m75941xfb8219142 = ja0Var.m75941xfb821914(5);
        r45.ai5 ai5Var = new r45.ai5();
        ai5Var.set(0, 150);
        m75941xfb8219142.add(ai5Var);
    }

    public final void b(int i17) {
        java.lang.String str = "" + java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = this.f90277d;
        r45.ja0 ja0Var = new r45.ja0();
        a(ja0Var, str, i17, 10L, 0L);
        ja0Var.set(8, 1);
        ja0Var.set(9, 2);
        r45.ja0 ja0Var2 = new r45.ja0();
        a(ja0Var2, str, i17, 10L, 0L);
        ja0Var2.set(8, 2);
        ja0Var2.set(9, 30);
        arrayList.addAll(kz5.c0.i(ja0Var, ja0Var2));
        for (int i18 = 1; i18 < 12; i18++) {
            r45.ja0 ja0Var3 = new r45.ja0();
            a(ja0Var3, str, i17, 10L, i18 * 2);
            ja0Var3.set(8, 2);
            ja0Var3.set(9, java.lang.Integer.valueOf(60 - (i18 * 5)));
            arrayList.add(ja0Var3);
        }
        r45.ja0 ja0Var4 = new r45.ja0();
        a(ja0Var4, str, i17, 10L, 10L);
        ja0Var4.set(8, 3);
        ja0Var4.set(9, 10);
        r45.ja0 ja0Var5 = new r45.ja0();
        a(ja0Var5, str, i17, 10L, 10L);
        ja0Var5.set(8, 4);
        ja0Var5.set(9, 10);
        ja0Var5.set(7, java.lang.Boolean.TRUE);
        r45.ja0 ja0Var6 = new r45.ja0();
        a(ja0Var6, str, i17, 10L, 10L);
        int i19 = 6;
        ja0Var6.set(8, 6);
        ja0Var6.set(9, 30);
        arrayList.addAll(kz5.c0.i(ja0Var4, ja0Var5, ja0Var6));
        int i27 = 1;
        while (i27 < i19) {
            r45.ja0 ja0Var7 = new r45.ja0();
            int i28 = i19;
            a(ja0Var7, str, i17, 10L, 10L);
            ja0Var7.set(8, java.lang.Integer.valueOf(i28));
            ja0Var7.set(9, java.lang.Integer.valueOf((30 - (i27 * 5)) * 1));
            arrayList.add(ja0Var7);
            i27++;
            i19 = i28;
        }
        r45.ja0 ja0Var8 = new r45.ja0();
        a(ja0Var8, str, i17, 10L, 10L);
        ja0Var8.set(8, 7);
        ja0Var8.set(9, 10);
        r45.ja0 ja0Var9 = new r45.ja0();
        a(ja0Var9, str, i17, 10L, 10L);
        ja0Var9.set(8, 8);
        ja0Var9.set(9, 10);
        arrayList.addAll(kz5.c0.i(ja0Var8, ja0Var9));
    }
}
