package p001xcca8366f.p011x373aa5;

/* renamed from: android.view.ViewTreeObserverCopyOnWriteArrayWrap */
/* loaded from: classes10.dex */
public class C0052x1165411<T> extends android.view.ViewTreeObserver.CopyOnWriteArray<T> {

    /* renamed from: mVisitor */
    final p001xcca8366f.p011x373aa5.InterfaceC0051x421b4747<T> f75xb9eae741;

    public C0052x1165411(p001xcca8366f.p011x373aa5.InterfaceC0051x421b4747<T> interfaceC0051x421b4747) {
        this.f75xb9eae741 = interfaceC0051x421b4747;
    }

    public void add(T t17) {
        T add = this.f75xb9eae741.add(t17);
        if (add != null) {
            super.add(add);
        } else {
            super.add(t17);
        }
    }

    /* renamed from: clear */
    public void m2498x5a5b64d() {
        this.f75xb9eae741.mo2495x5a5b64d();
        super.clear();
    }

    public void end() {
        this.f75xb9eae741.end();
        super.end();
    }

    /* renamed from: remove */
    public void m2499xc84af884(T t17) {
        this.f75xb9eae741.mo2496xc84af884(t17);
        super.remove(t17);
    }

    /* renamed from: size */
    public int m2500x35e001() {
        int mo2497x35e001 = this.f75xb9eae741.mo2497x35e001();
        return mo2497x35e001 >= 0 ? mo2497x35e001 : super.size();
    }
}
