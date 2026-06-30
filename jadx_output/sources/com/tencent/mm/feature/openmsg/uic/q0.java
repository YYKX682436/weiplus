package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class q0 extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        hb0.a aVar = new hb0.a();
        java.lang.String stringExtra = getIntent().getStringExtra("key_talker");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVar.f280016i = stringExtra;
        aVar.f280013f = getIntent().getBooleanExtra("key_is_multi_select", false);
        aVar.f280014g = getIntent().getLongExtra("key_msg_id", 0L);
        long[] longArrayExtra = getIntent().getLongArrayExtra("key_msg_id_list");
        aVar.f280015h = longArrayExtra != null ? kz5.z.y0(longArrayExtra) : new java.util.ArrayList();
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_material_origin");
        aVar.f280012e = stringExtra2 != null ? stringExtra2 : "";
        aVar.f280017m = (com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel) getIntent().getParcelableExtra("key_material_model");
        aVar.f280018n = getIntent().getLongExtra("key_open_type", 2L);
        aVar.f280019o = getIntent().getStringExtra("key_session_id");
        aVar.f280020p = getIntent().getLongExtra("key_scene_type", 0L);
        return aVar;
    }
}
