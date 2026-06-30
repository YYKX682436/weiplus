package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class c0 implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 f91069d;

    public c0(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 c0077x141f33d1) {
        this.f91069d = c0077x141f33d1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 c0077x141f33d1 = this.f91069d;
        android.widget.FrameLayout frameLayout = c0077x141f33d1.f90886m;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b0 b0Var = c0077x141f33d1.f90880d;
        if (view == frameLayout) {
            c0077x141f33d1.a();
            b0Var.getClass();
            throw null;
        }
        if (view != c0077x141f33d1.f90884h) {
            throw new java.lang.IllegalArgumentException();
        }
        b0Var.getClass();
        throw new java.lang.IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        n3.d dVar;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 c0077x141f33d1 = this.f91069d;
        android.widget.PopupWindow.OnDismissListener onDismissListener = c0077x141f33d1.f90890q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        n3.f fVar = c0077x141f33d1.f90887n;
        if (fVar == null || (dVar = fVar.f415863a) == null) {
            return;
        }
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q) dVar).n(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b0) adapterView.getAdapter()).getItemViewType(i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 c0077x141f33d1 = this.f91069d;
        c0077x141f33d1.a();
        c0077x141f33d1.f90880d.getClass();
        throw null;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 c0077x141f33d1 = this.f91069d;
        if (view != c0077x141f33d1.f90886m) {
            throw new java.lang.IllegalArgumentException();
        }
        c0077x141f33d1.f90880d.getClass();
        throw null;
    }
}
