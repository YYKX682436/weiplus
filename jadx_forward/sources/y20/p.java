package y20;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq.f f540552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.test.EcsTestUI f540553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qq.f fVar, com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI) {
        super(1);
        this.f540552d = fVar;
        this.f540553e = ecsTestUI;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object newValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newValue, "newValue");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Switch value changed: ");
        qq.f fVar = this.f540552d;
        qq.g gVar = (qq.g) fVar;
        sb6.append(gVar.f447401b);
        sb6.append(" = ");
        sb6.append(newValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsTestUI", sb6.toString());
        com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI = this.f540553e;
        int indexOf = ecsTestUI.m.indexOf(fVar);
        java.util.List V0 = kz5.n0.V0(ecsTestUI.m);
        java.lang.String title = gVar.f447400a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        java.lang.String key = gVar.f447401b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.List options = gVar.f447402c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        java.lang.Object defaultValue = gVar.f447403d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        java.lang.String storageKey = gVar.f447404e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageKey, "storageKey");
        ((java.util.ArrayList) V0).set(indexOf, new qq.g(title, key, options, defaultValue, storageKey));
        ecsTestUI.m = V0;
        y20.n nVar = ecsTestUI.h;
        if (nVar != null) {
            nVar.m8146xced61ae5();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
        throw null;
    }
}
