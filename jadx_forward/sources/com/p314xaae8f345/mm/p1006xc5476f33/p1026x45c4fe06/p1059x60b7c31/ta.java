package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes12.dex */
public class ta implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11931x604547f3 f165003a;

    public ta(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11931x604547f3 c11931x604547f3) {
        this.f165003a = c11931x604547f3;
    }

    @Override // nf.j
    /* renamed from: onResult */
    public void mo14598x57429edc(int i17, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11931x604547f3 c11931x604547f3 = this.f165003a;
        if (i17 == -1) {
            c11931x604547f3.f160120g.a(c11931x604547f3.f160121h, c11931x604547f3.f160119f.o("ok"));
            c11931x604547f3.x();
        } else if (i17 == 0) {
            c11931x604547f3.f160120g.a(c11931x604547f3.f160121h, c11931x604547f3.f160119f.o("cancel"));
            c11931x604547f3.x();
        } else {
            c11931x604547f3.f160120g.a(c11931x604547f3.f160121h, c11931x604547f3.f160119f.o("fail"));
            c11931x604547f3.x();
        }
    }
}
