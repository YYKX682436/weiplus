package fb5;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb5.e f342417d;

    public d(fb5.e eVar) {
        this.f342417d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f342417d.notifyDataSetChanged();
    }
}
