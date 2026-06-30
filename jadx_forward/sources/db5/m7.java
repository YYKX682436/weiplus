package db5;

/* loaded from: classes.dex */
public class m7 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309973a;

    public m7(android.content.Context context) {
        this.f309973a = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g
    public void a() {
        android.content.Context context = this.f309973a;
        if (z2.h.b((android.app.Activity) context, "android.permission.READ_EXTERNAL_STORAGE")) {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 22L, 1L, true);
            z2.h.a((android.app.Activity) context, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 32767);
        } else {
            android.content.Context context2 = this.f309973a;
            db5.e1.C(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhr), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new db5.k7(this), new db5.l7(this));
        }
    }
}
