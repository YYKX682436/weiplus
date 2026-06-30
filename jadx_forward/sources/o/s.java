package o;

/* loaded from: classes15.dex */
public class s implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, o.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final o.r f423333d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.m f423334e;

    /* renamed from: f, reason: collision with root package name */
    public o.n f423335f;

    public s(o.r rVar) {
        this.f423333d = rVar;
    }

    @Override // o.f0
    public void a(o.r rVar, boolean z17) {
        p012xc85e97e9.p016x746ad0e3.app.m mVar;
        if ((z17 || rVar == this.f423333d) && (mVar = this.f423334e) != null) {
            mVar.dismiss();
        }
    }

    @Override // o.f0
    public boolean c(o.r rVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        o.n nVar = this.f423335f;
        if (nVar.f423286i == null) {
            nVar.f423286i = new o.m(nVar);
        }
        this.f423333d.q(nVar.f423286i.getItem(i17), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f423335f.a(this.f423333d, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        android.view.Window window;
        android.view.View decorView;
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        android.view.View decorView2;
        android.view.KeyEvent.DispatcherState keyDispatcherState2;
        o.r rVar = this.f423333d;
        if (i17 == 82 || i17 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.Window window2 = this.f423334e.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f423334e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                rVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return rVar.performShortcut(i17, keyEvent, 0);
    }
}
