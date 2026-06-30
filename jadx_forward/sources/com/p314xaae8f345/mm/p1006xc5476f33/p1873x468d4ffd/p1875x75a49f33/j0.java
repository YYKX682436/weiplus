package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe f230573d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe) {
        this.f230573d = c16539x811795fe;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "exec initAsyncTask");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe = this.f230573d;
        if (c16539x811795fe.getHeight() == 0 || c16539x811795fe.getWidth() == 0) {
            c16539x811795fe.post(this);
            return;
        }
        if (c16539x811795fe.f230432r / c16539x811795fe.f230434t > 0) {
            c16539x811795fe.f230423f = c16539x811795fe.getHeight();
            c16539x811795fe.f230424g = (int) ((c16539x811795fe.getWidth() - (c16539x811795fe.f230428n * 2)) / (((float) c16539x811795fe.f230432r) / ((float) c16539x811795fe.f230434t)));
            s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i0(c16539x811795fe), "check duration of ");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerThumbSeekBar", "initAsyncTask return " + c16539x811795fe.f230432r + " / " + c16539x811795fe.f230434t);
        }
    }
}
