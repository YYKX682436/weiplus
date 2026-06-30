package com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2568xddd166e0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/serialize/RepairerConfigUseNewSerializeUpdate;", "Lq55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.config.serialize.RepairerConfigUseNewSerializeUpdate */
/* loaded from: classes.dex */
public final class C20697x83a53c54 extends q55.a {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_UseNewSerializeUpdate";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "更新序列化解析方案";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20921x541526db.class;
    }

    @Override // q55.a
    public void h(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2568xddd166e0.C20696x4654c3ab()) != 1;
        zn4.f.f556035d = z17;
        if (z17) {
            android.widget.Toast.makeText(context, "更新成功，当前使用旧方案", 0).show();
        } else {
            android.widget.Toast.makeText(context, "更新成功，当前使用新方案", 0).show();
        }
    }
}
