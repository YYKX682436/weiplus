package com.p314xaae8f345.mm.sdk.p2602x14c752d6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u000b"}, d2 = {"com/tencent/mm/sdk/observer/MvvmObserverOwner$LifecycleBoundObserver", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onLifecycleDestroy", "Landroidx/lifecycle/y;", "owner", "observer", "", "threadTag", "<init>", "(Le75/g;Landroidx/lifecycle/y;Le75/a;Ljava/lang/String;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver */
/* loaded from: classes12.dex */
public class C20988xba34acb1 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f273938d;

    /* renamed from: e, reason: collision with root package name */
    public final e75.a f273939e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f273940f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e75.g f273941g;

    public C20988xba34acb1(e75.g gVar, p012xc85e97e9.p093xedfae76a.y owner, e75.a observer, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f273941g = gVar;
        this.f273938d = owner;
        this.f273939e = observer;
        this.f273940f = str;
    }

    public final void a(java.util.List eventList) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventList, "eventList");
        if (b()) {
            java.lang.String str = this.f273940f;
            if (str != null) {
                e75.g gVar = this.f273941g;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, e75.g.f69659x9393ed43)) {
                    d75.b.g(new e75.e(this, eventList));
                    obj = jz5.f0.f384359a;
                } else {
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    e75.f fVar = new e75.f(this, eventList, gVar);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    obj = t0Var.l(fVar, 0L, str);
                }
            } else {
                obj = null;
            }
            if (obj == null) {
                java.util.Iterator it = eventList.iterator();
                while (it.hasNext()) {
                    this.f273939e.mo2231x7bb163d5(it.next());
                }
            }
        }
    }

    public final boolean b() {
        return this.f273938d.mo273xed6858b4().b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED;
    }

    /* renamed from: hashCode */
    public int m77680x8cdac1b() {
        return this.f273939e.hashCode();
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onLifecycleDestroy */
    public void m77681xe98eb92f() {
        e75.g gVar = this.f273941g;
        gVar.mo42857x23aed0ac();
        this.f273938d.hashCode();
        e75.a aVar = this.f273939e;
        aVar.hashCode();
        gVar.mo127128xb5bdeb7a(aVar);
    }

    public /* synthetic */ C20988xba34acb1(e75.g gVar, p012xc85e97e9.p093xedfae76a.y yVar, e75.a aVar, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(gVar, yVar, aVar, (i17 & 4) != 0 ? null : str);
    }
}
