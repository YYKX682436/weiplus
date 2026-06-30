package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes4.dex */
public class za implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f292479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 f292480e;

    public za(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752, java.util.ArrayList arrayList) {
        this.f292480e = activityC22534xec824752;
        this.f292479d = arrayList;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752 = this.f292480e;
        g4Var.g(2, activityC22534xec824752.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i89), com.p314xaae8f345.mm.R.raw.f80089x8164b1e0);
        this.f292479d.add(4);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
        long longExtra = activityC22534xec824752.getIntent().getLongExtra("key_message_id", -1L);
        am.b6 b6Var = c5348xb8e1a564.f135674g;
        b6Var.f87752a = longExtra;
        b6Var.f87753b = activityC22534xec824752.getIntent().getStringExtra("key_message_talker");
        c5348xb8e1a564.e();
        if (c5348xb8e1a564.f135675h.f87869a) {
            g4Var.g(4, activityC22534xec824752.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3x), com.p314xaae8f345.mm.R.raw.f79841xc8521962);
        }
    }
}
