package as3;

/* loaded from: classes11.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView f13495d;

    public c0(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView) {
        this.f13495d = bizProfileTopicFlowView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if ((!r1.isEmpty()) == true) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView r0 = r5.f13495d
            as3.a0 r1 = r0.presenter
            r2 = 0
            if (r1 == 0) goto L14
            java.util.ArrayList r1 = r1.f13485d
            if (r1 == 0) goto L14
            boolean r1 = r1.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 != r3) goto L14
            goto L15
        L14:
            r3 = r2
        L15:
            if (r3 == 0) goto L6c
            r1 = 2131304751(0x7f09212f, float:1.8227653E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            if (r1 == 0) goto L75
            zy2.xb r3 = r0.layoutManager
            if (r3 == 0) goto L58
            as3.a0 r4 = r0.presenter
            if (r4 == 0) goto L33
            java.util.ArrayList r4 = r4.f13485d
            if (r4 == 0) goto L33
            int r4 = r4.size()
            goto L34
        L33:
            r4 = r2
        L34:
            com.tencent.mm.plugin.finder.profile.FlowLayoutManager r3 = (com.tencent.mm.plugin.finder.profile.FlowLayoutManager) r3
            int r3 = r3.o(r2)
            if (r4 <= r3) goto L3f
            r1.setVisibility(r2)
        L3f:
            r2 = 2131304750(0x7f09212e, float:1.8227651E38)
            android.view.View r2 = r1.findViewById(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.mm.ui.widget.imageview.WeImageView) r2
            as3.d0 r3 = new as3.d0
            r3.<init>(r0, r2)
            r0.setOnClickListener(r3)
            as3.e0 r3 = new as3.e0
            r3.<init>(r2)
            r0.setOnTouchListener(r3)
        L58:
            android.content.Context r0 = r0.getContext()
            r2 = 20
            int r0 = i65.a.b(r0, r2)
            fq1.e r2 = fq1.e.f265507a
            android.view.ViewParent r3 = r1.getParent()
            r2.b(r3, r1, r0, r0)
            goto L75
        L6c:
            zy2.xb r0 = r0.layoutManager
            if (r0 != 0) goto L71
            goto L75
        L71:
            com.tencent.mm.plugin.finder.profile.FlowLayoutManager r0 = (com.tencent.mm.plugin.finder.profile.FlowLayoutManager) r0
            r0.f123306q = r2
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: as3.c0.run():void");
    }
}
