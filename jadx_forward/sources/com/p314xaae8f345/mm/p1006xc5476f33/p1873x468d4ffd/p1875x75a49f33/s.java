package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 f230618d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4) {
        this.f230618d = c16538x58704dc4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "exec initAsyncTask");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = this.f230618d;
        if (c16538x58704dc4.getHeight() == 0 || c16538x58704dc4.getWidth() == 0) {
            c16538x58704dc4.post(c16538x58704dc4.f230418t);
            return;
        }
        c16538x58704dc4.f230408g = c16538x58704dc4.getHeight();
        c16538x58704dc4.f230409h = (c16538x58704dc4.getWidth() - (c16538x58704dc4.f230415q * 2)) / 12;
        s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.r(this), "check duration of ");
    }
}
