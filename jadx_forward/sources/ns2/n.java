package ns2;

/* loaded from: classes2.dex */
public final class n extends ns2.o {

    /* renamed from: d, reason: collision with root package name */
    public int f420946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17, java.util.List list) {
        super(activity, componentCallbacksC1101xa17d4670, list, null, null, 24, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f420946d = i17;
    }

    @Override // ns2.l
    public void a() {
        for (android.view.View view : this.f420949c) {
            if (view instanceof android.widget.TextView) {
                ((android.widget.TextView) view).setTextColor(this.f420946d);
            } else if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
                ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).m84183x1c5c5ff4(this.f420946d);
            }
        }
    }
}
