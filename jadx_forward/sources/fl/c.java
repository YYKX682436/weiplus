package fl;

/* loaded from: classes12.dex */
public final class c extends xm1.k {

    /* renamed from: k, reason: collision with root package name */
    public final yz5.l f345226k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f345227l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f345228m;

    public c(yz5.l onStartRecord) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onStartRecord, "onStartRecord");
        this.f345226k = onStartRecord;
        i();
        ym1.f.f544667h.h(this, "record");
        this.f345227l = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(new fl.b(this));
    }

    public final void C() {
        this.f345227l.mo50302x6b17ad39(null);
        if (this.f345228m) {
            q("record");
            this.f345228m = false;
        }
        ym1.f.f544667h.o("record");
    }

    @Override // xm1.h
    public void o(int i17) {
        super.o(i17);
        if (i17 == 2 || i17 == 3) {
            java.lang.Object obj = null;
            this.f345227l.mo50302x6b17ad39(null);
            java.util.Iterator it = this.f536703b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) next, "record")) {
                    obj = next;
                    break;
                }
            }
            if (obj != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceRecorderAudioManager", "checkIfSomeRequestAvailable available");
                this.f345226k.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        }
    }
}
