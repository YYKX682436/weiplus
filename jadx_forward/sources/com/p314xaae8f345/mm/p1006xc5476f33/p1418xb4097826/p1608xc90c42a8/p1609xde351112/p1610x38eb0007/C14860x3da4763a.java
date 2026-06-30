package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageDbSource;", "Lir2/a0;", "Lso2/i;", "Companion", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageDbSource */
/* loaded from: classes10.dex */
public final class C14860x3da4763a implements ir2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f204805d;

    /* renamed from: e, reason: collision with root package name */
    public final int f204806e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f204807f;

    /* renamed from: g, reason: collision with root package name */
    public final int f204808g;

    /* renamed from: h, reason: collision with root package name */
    public final ir2.z f204809h;

    /* renamed from: i, reason: collision with root package name */
    public long f204810i;

    /* renamed from: m, reason: collision with root package name */
    public int f204811m;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageDbSource$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageDbSource$Companion */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }
    }

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14860x3da4763a.Companion(null);
    }

    public C14860x3da4763a(int[] messageTypes, int i17, java.lang.String username, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageTypes, "messageTypes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f204805d = messageTypes;
        this.f204806e = i17;
        this.f204807f = username;
        this.f204808g = i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i19 : messageTypes) {
            sb6.append(i19);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append((java.lang.Object) sb6);
        sb7.append('-');
        sb7.append(this.f204806e);
        sb7.append('-');
        sb7.append(this.f204808g);
        this.f204809h = new ir2.z(sb7.toString());
    }

    @Override // ir2.a0
    public java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        cu2.a0 a0Var = cu2.b0.f303904a;
        java.util.List b17 = a0Var.b(this.f204810i, this.f204811m, this.f204805d, this.f204806e, this.f204807f, this.f204808g);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            so2.i j17 = a0Var.j((dm.pd) it.next());
            if (j17 != null) {
                arrayList.add(j17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMessageDbSource", "load:" + arrayList.size());
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e(arrayList, false);
    }

    @Override // ir2.a0, ay1.m
    /* renamed from: getKey */
    public java.lang.Object getF204809h() {
        return this.f204809h;
    }

    @Override // ir2.a0, ay1.m
    /* renamed from: getKey, reason: from getter */
    public ir2.z getF204809h() {
        return this.f204809h;
    }
}
