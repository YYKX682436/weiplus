package vm1;

/* loaded from: classes10.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f519517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f519519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519520g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String str, long j17, java.lang.String str2, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519518e = str;
        this.f519519f = j17;
        this.f519520g = str2;
        this.f519521h = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vm1.b0(this.f519518e, this.f519519f, this.f519520g, this.f519521h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vm1.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f519517d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            um1.a aVar2 = mm1.b0.f410168i;
            um1.a aVar3 = mm1.b0.f410168i;
            if (aVar3 != null) {
                this.f519517d = 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28) aVar3).a7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f519518e);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene", (int) this.f519519f);
        intent.putExtra("Contact_Scene_Note", this.f519520g);
        j45.l.j(this.f519521h, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        return f0Var;
    }
}
