package jn2;

/* loaded from: classes10.dex */
public final class j0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn2.m0 f382166a;

    public j0(jn2.m0 m0Var) {
        this.f382166a = m0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: clearView */
    public void mo8113xb4407692(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        super.mo8113xb4407692(recyclerView, viewHolder);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongEditPanel", "clearView pos:" + viewHolder.m8183xf806b362());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(3, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isItemViewSwipeEnabled */
    public boolean mo8126x5b4a2f69() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r5, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r6, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r7) {
        /*
            r4 = this;
            java.lang.String r0 = "recyclerView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r5 = "source"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r5)
            java.lang.String r5 = "target"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r5)
            int r5 = r6.m8183xf806b362()
            int r6 = r7.m8183xf806b362()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "onMove from:"
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r0 = " - to:"
            r7.append(r0)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "FinderLiveAnchorSingSongEditPanel"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            jn2.m0 r7 = r4.f382166a
            jn2.r0 r0 = r7.R
            r1 = 1
            if (r5 < 0) goto L54
            java.util.List r0 = r0.f382210f
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            if (r5 >= r3) goto L57
            if (r6 < 0) goto L57
            int r2 = r2.size()
            if (r6 < r2) goto L4f
            goto L57
        L4f:
            java.util.Collections.swap(r0, r5, r6)
            r0 = r1
            goto L58
        L54:
            r0.getClass()
        L57:
            r0 = 0
        L58:
            if (r0 == 0) goto L5f
            jn2.r0 r7 = r7.R
            r7.m8150x87567217(r5, r6)
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.j0.mo8132xc39cb650(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.k3, androidx.recyclerview.widget.k3):boolean");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
    }
}
