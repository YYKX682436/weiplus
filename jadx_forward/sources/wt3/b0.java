package wt3;

/* loaded from: classes5.dex */
public class b0 extends wt3.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f530915o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(im5.b lifeCycleKeeper, java.util.ArrayList images, int i17) {
        super(lifeCycleKeeper, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(images, "images");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f530915o = arrayList;
        arrayList.addAll(images);
        this.f530929e = i17;
    }

    @Override // wt3.e
    public wt3.n0 f(wt3.q classifier) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classifier, "classifier");
        return new wt3.k0(this.f530915o, this.f530929e, classifier);
    }

    @Override // wt3.e
    public boolean i() {
        return this instanceof qv3.b;
    }
}
