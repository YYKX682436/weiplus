package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class w4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.r f104841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.x4 f104842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104843f;

    public w4(so2.r rVar, com.tencent.mm.plugin.finder.convert.x4 x4Var, in5.s0 s0Var) {
        this.f104841d = rVar;
        this.f104842e = x4Var;
        this.f104843f = s0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0091, code lost:
    
        vz5.b.a(r8, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderActionStorage", "getAllFailedCommentsByFeedId " + r3 + ' ' + r5 + " listsize:" + r0);
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00be, code lost:
    
        if (r0.hasNext() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c0, code lost:
    
        r3 = (com.tencent.mm.plugin.finder.storage.yj0) r0.next();
        r3.field_canRemove = 1;
        r1.L0(r3.field_localCommentId, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ce, code lost:
    
        r2.f410566g = 1;
        r0 = r2.f410563d;
        r3 = r2.f410564e;
        r13 = r2.f410565f;
        r44.f104842e.getClass();
        r4 = r44.f104843f;
        r5 = r4.f293121e;
        kotlin.jvm.internal.o.f(r5, "getContext(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fc, code lost:
    
        if ((r5 instanceof com.tencent.mm.ui.MMFragmentActivity) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fe, code lost:
    
        r5 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) r5).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0110, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0112, code lost:
    
        r9 = r5.V6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0116, code lost:
    
        new db2.g4(r0, r13, 5, 2, "", true, null, null, 0, null, false, false, null, r9, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, r3, null, 402644928, null).l().h(new com.tencent.mm.plugin.finder.convert.v4(r4, r0));
        yj0.a.h(r44, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentFailedNotifyConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0158, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010f, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x007e, code lost:
    
        if (r8.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0080, code lost:
    
        r10 = new com.tencent.mm.plugin.finder.storage.yj0();
        r10.convertFrom(r8);
        r0.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x008f, code lost:
    
        if (r8.moveToNext() != false) goto L30;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r45) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.w4.onClick(android.view.View):void");
    }
}
