package y73;

/* loaded from: classes11.dex */
public class f0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f541252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y73.d0 f541253e;

    public f0(y73.d0 d0Var, android.content.Context context) {
        this.f541253e = d0Var;
        this.f541252d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f541252d.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_before_install", this.f541253e.f541239d.f223947m).apply();
    }
}
