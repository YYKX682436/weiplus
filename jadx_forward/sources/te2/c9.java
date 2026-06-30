package te2;

/* loaded from: classes3.dex */
public final class c9 extends im2.w4 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter f499464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570532b04;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback viewCallback;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter presenter = this.f499464d;
        if (presenter == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        if (i18 == -1 && i17 == 1 && (viewCallback = presenter.f204319h) != null) {
            viewCallback.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        O6();
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("KEY_HAS_NEXT_ACTION", false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.Serializable serializableExtra = m158359x1e885992().getSerializableExtra("KEY_TAG_INFO");
        java.util.List<byte[]> list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        if (list != null) {
            for (byte[] bArr : list) {
                r45.fd2 fd2Var = new r45.fd2();
                fd2Var.mo11468x92b714fd(bArr);
                arrayList.add(fd2Var);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new so2.u2((r45.fd2) it.next()));
        }
        this.f499464d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter(arrayList2, booleanExtra);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter presenter = this.f499464d;
        if (presenter == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback viewCallback = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.ViewCallback(abstractActivityC21394xb3d2c0cf, presenter);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter presenter2 = this.f499464d;
        if (presenter2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        presenter2.c(viewCallback);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14713xeb9ec5bb.Presenter presenter = this.f499464d;
        if (presenter == null || presenter != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }
}
