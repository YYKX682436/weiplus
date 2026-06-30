package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0017\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/WindowLayoutInfo;", "", "displayFeatures", "", "Landroidx/window/layout/DisplayFeature;", "(Ljava/util/List;)V", "getDisplayFeatures", "()Ljava/util/List;", "equals", "", "other", "hashCode", "", "toString", "", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.layout.WindowLayoutInfo */
/* loaded from: classes8.dex */
public final class C1249xd38bff28 {
    private final java.util.List<p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1231xeab5c7f4> displayFeatures;

    /* JADX WARN: Multi-variable type inference failed */
    public C1249xd38bff28(java.util.List<? extends p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1231xeab5c7f4> displayFeatures) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayFeatures, "displayFeatures");
        this.displayFeatures = displayFeatures;
    }

    /* renamed from: equals */
    public boolean m8633xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28.class, other.getClass())) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.displayFeatures, ((p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28) other).displayFeatures);
    }

    /* renamed from: getDisplayFeatures */
    public final java.util.List<p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1231xeab5c7f4> m8634x8bd250e9() {
        return this.displayFeatures;
    }

    /* renamed from: hashCode */
    public int m8635x8cdac1b() {
        return this.displayFeatures.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m8636x9616526c() {
        return kz5.n0.g0(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
