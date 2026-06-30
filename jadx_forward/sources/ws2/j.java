package ws2;

/* loaded from: classes3.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f530589d;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.ArrayList arrayList = this.f530589d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r8, int r9) {
        /*
            r7 = this;
            ws2.i r8 = (ws2.i) r8
            java.lang.String r0 = "vh"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            if (r9 < 0) goto L12
            int r0 = r7.mo1894x7e414b06()
            if (r9 >= r0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.String r1 = "FinderLiveReplayViewCallback"
            r2 = 0
            if (r0 == 0) goto L23
            java.util.ArrayList r0 = r7.f530589d
            if (r0 == 0) goto L39
            java.lang.Object r0 = r0.get(r9)
            km2.m r0 = (km2.m) r0
            goto L3a
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "getData invalid pos:"
            r0.<init>(r3)
            r0.append(r9)
            r3 = 33
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
        L39:
            r0 = r2
        L3a:
            android.view.View r3 = r8.f3639x46306858
            r4 = 2131307302(0x7f092b26, float:1.8232827E38)
            android.view.View r3 = r3.findViewById(r4)
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "replay_step2-1:bind view,"
            r4.<init>(r5)
            if (r0 == 0) goto L55
            com.tencent.mm.live.api.LiveConfig r5 = r0.f390662d
            if (r5 == 0) goto L55
            java.lang.String r5 = r5.f150084u
            goto L56
        L55:
            r5 = r2
        L56:
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            if (r0 == 0) goto L67
            com.tencent.mm.live.api.LiveConfig r5 = r0.f390662d
            if (r5 == 0) goto L67
            java.lang.String r5 = r5.M
            goto L68
        L67:
            r5 = r2
        L68:
            r4.append(r5)
            java.lang.String r5 = ",pos:"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r9 = "(itemCount:"
            r4.append(r9)
            int r9 = r7.mo1894x7e414b06()
            r4.append(r9)
            java.lang.String r9 = "),liveId:"
            r4.append(r9)
            if (r0 == 0) goto L90
            com.tencent.mm.live.api.LiveConfig r9 = r0.f390662d
            if (r9 == 0) goto L90
            long r5 = r9.f150070e
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
        L90:
            r4.append(r2)
            java.lang.String r9 = ",viewHolder:"
            r4.append(r9)
            int r8 = r8.hashCode()
            r4.append(r8)
            java.lang.String r8 = ",pluginLayout:"
            r4.append(r8)
            int r8 = r3.hashCode()
            r4.append(r8)
            java.lang.String r8 = ",size:"
            r4.append(r8)
            int r8 = r3.m46544xd72ea9ca()
            r4.append(r8)
            r8 = 125(0x7d, float:1.75E-43)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r8)
            if (r0 == 0) goto Lc9
            r3.mo57463x37f82187(r0)
            goto Lce
        Lc9:
            java.lang.String r8 = "bind view err: data is null!!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r8)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.j.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup vg6, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vg6, "vg");
        android.view.View inflate = android.view.View.inflate(vg6.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ayd, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6) inflate.findViewById(com.p314xaae8f345.mm.R.id.fk9);
        inflate.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, -1));
        ws2.i iVar = new ws2.i(this, inflate);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "replay_step0-0 onCreateViewHolder viewHolder:" + iVar.hashCode() + ",pluginLayout:" + c14929x59565fb6.hashCode() + ",size:" + c14929x59565fb6.m46544xd72ea9ca() + '}');
        return iVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        ws2.i holder = (ws2.i) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "onViewDetachedFromWindow, " + holder.hashCode());
        super.mo8161x38c82990(holder);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        x(itemView);
    }

    public final void x(android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    childAt.animate().cancel();
                    if (childAt.hasTransientState()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "[protectViewItemRecycleHealthy] child=" + childAt);
                    }
                    x(childAt);
                }
            }
            view.animate().cancel();
        }
    }
}
