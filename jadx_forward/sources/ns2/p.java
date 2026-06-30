package ns2;

/* loaded from: classes2.dex */
public final class p extends ns2.o {

    /* renamed from: d, reason: collision with root package name */
    public final int f420950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17, java.util.List list) {
        super(activity, componentCallbacksC1101xa17d4670, list, null, null, 24, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f420950d = i17;
    }

    @Override // ns2.l
    public void a() {
        java.util.Iterator it = this.f420949c.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setBackgroundColor(this.f420950d);
        }
    }
}
