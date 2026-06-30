package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 f232266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872.AnonymousClass4 f232267e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872.AnonymousClass4 anonymousClass4, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
        this.f232267e = anonymousClass4;
        this.f232266d = c5722xb16ab0f4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872.this.f232241m;
        java.lang.String str = this.f232266d.f136045g.f88571d;
        java.util.Iterator it = uVar.f232335m.entrySet().iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t) ((android.view.View) ((java.util.Map.Entry) it.next()).getValue()).getTag();
            if (tVar.f232312a.f66983xc8c6afdb.equals(str)) {
                tVar.c(ll3.o2.Ai().y0(str), true);
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainAdapter", "holder song id is not exist, do refresh all");
        uVar.mo8343xced61ae5();
    }
}
