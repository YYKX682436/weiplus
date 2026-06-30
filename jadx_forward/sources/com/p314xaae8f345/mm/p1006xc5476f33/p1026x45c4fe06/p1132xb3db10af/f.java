package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f165681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.g f165682e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.g gVar, java.util.List list) {
        this.f165682e = gVar;
        this.f165681d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12308x8b10b259 activityC12308x8b10b259 = this.f165682e.f165686a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12308x8b10b259.f165629p;
        android.widget.ListView listView = (android.widget.ListView) activityC12308x8b10b259.findViewById(com.p314xaae8f345.mm.R.id.i38);
        if (listView == null) {
            activityC12308x8b10b259.finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.j(activityC12308x8b10b259);
        listView.setAdapter((android.widget.ListAdapter) jVar);
        listView.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.i(activityC12308x8b10b259, jVar));
        jVar.f165692e = this.f165681d;
        jVar.notifyDataSetChanged();
    }
}
