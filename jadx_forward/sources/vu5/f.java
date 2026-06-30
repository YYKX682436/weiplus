package vu5;

/* loaded from: classes12.dex */
public class f extends vu5.b implements android.os.Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public final vu5.e f521885e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f521886f = ru5.d.a("ColdPoolLeader", this);

    public f(int i17, int i18) {
        this.f521885e = new vu5.e(this, i17, i18);
    }

    @Override // vu5.k
    public void a(wu5.l lVar) {
        this.f521886f.removeCallbacksAndMessages(lVar);
        this.f521885e.remove(lVar);
    }

    @Override // vu5.b
    public vu5.a b() {
        return this.f521885e;
    }

    public java.util.List d() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.Runnable runnable : this.f521885e.getQueue()) {
            if (runnable instanceof wu5.l) {
                linkedList.add(((wu5.l) runnable).mo1867xb5884f29());
            } else {
                linkedList.add(runnable.toString());
            }
        }
        return linkedList;
    }

    public void e() {
        this.f521885e.shutdown();
    }

    @Override // vu5.k
    /* renamed from: getName */
    public java.lang.String mo172679xfb82e301() {
        return "ColdPool";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.lang.Object obj = message.obj;
        if (!(obj instanceof wu5.l)) {
            return false;
        }
        this.f521885e.execute((wu5.l) obj);
        return true;
    }
}
