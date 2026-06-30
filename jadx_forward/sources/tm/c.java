package tm;

/* loaded from: classes11.dex */
public class c implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f501952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f501953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f501954c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm.a f501955d;

    public c(tm.a aVar, android.content.DialogInterface.OnClickListener onClickListener, android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener2) {
        this.f501955d = aVar;
        this.f501952a = onClickListener;
        this.f501953b = context;
        this.f501954c = onClickListener2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (!z17) {
            android.content.DialogInterface.OnClickListener onClickListener = this.f501954c;
            if (onClickListener != null) {
                onClickListener.onClick(null, -2);
                return;
            }
            return;
        }
        android.content.DialogInterface.OnClickListener onClickListener2 = this.f501952a;
        if (onClickListener2 != null) {
            onClickListener2.onClick(null, -1);
            return;
        }
        cm5.c.f124959a.a(this.f501953b, this.f501955d.f501931a);
    }
}
