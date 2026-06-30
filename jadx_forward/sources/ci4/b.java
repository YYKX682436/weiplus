package ci4;

/* loaded from: classes10.dex */
public final class b extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b f123247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        jz5.h.b(ci4.a.f123246d);
        new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[RETURN] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2274xbdc3c5dc() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.uniComments.b r0 = r3.f123247d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer r0 = r0.f211735a
            if (r0 == 0) goto L12
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 != r1) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L26
            com.tencent.mm.plugin.finder.uniComments.b r0 = r3.f123247d
            if (r0 == 0) goto L25
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer r0 = r0.f211735a
            if (r0 == 0) goto L25
            r0.h()
        L25:
            return r1
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ci4.b.mo2274xbdc3c5dc():boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d12;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b bVar = this.f123247d;
        if (bVar != null && (c15144x165092d12 = bVar.f211735a) != null) {
            c15144x165092d12.h();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b bVar2 = this.f123247d;
        if (bVar2 == null || (c15144x165092d1 = bVar2.f211735a) == null) {
            return;
        }
        c15144x165092d1.b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b bVar = this.f123247d;
        if (bVar == null || (c15144x165092d1 = bVar.f211735a) == null) {
            return;
        }
        c15144x165092d1.k(false);
    }
}
