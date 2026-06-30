package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269845d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269845d = activityC19519x7af4daf3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269845d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2453xbb6ca34f.C19526x6d94048c c19526x6d94048c = activityC19519x7af4daf3.K;
        if (c19526x6d94048c != null) {
            int i17 = activityC19519x7af4daf3.W;
            int i18 = activityC19519x7af4daf3.X;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c19526x6d94048c, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$28", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c19526x6d94048c.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c19526x6d94048c, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$28", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            activityC19519x7af4daf3.U = activityC19519x7af4daf3.W;
            activityC19519x7af4daf3.V = activityC19519x7af4daf3.X;
        }
    }
}
