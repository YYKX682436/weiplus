package hn;

/* loaded from: classes4.dex */
public final class r implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg3.h3 f363907d;

    public r(vg3.h3 h3Var) {
        this.f363907d = h3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent bindData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindData, "bindData");
        if (i17 == 15002 && i18 == -1) {
            java.lang.String stringExtra = bindData.getStringExtra("key_chat_room_open_id");
            vg3.h3 h3Var = this.f363907d;
            if (h3Var != null) {
                h3Var.a(true, null, stringExtra);
            }
        }
    }
}
