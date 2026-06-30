package w51;

/* loaded from: classes15.dex */
public class e extends w51.d implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public final w51.i f524505p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f524506q;

    public e(android.content.Context context) {
        super(context);
        this.f524505p = new w51.i();
        this.f524506q = context;
    }

    @Override // w51.d
    public boolean c() {
        this.f524499g.getClass();
        return false;
    }

    public com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 d() {
        w51.i iVar = this.f524505p;
        if (iVar.f524513a == null) {
            iVar.f524513a = new com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480(this.f524506q);
        }
        return iVar.f524513a;
    }

    public void e() {
        if (this.f524499g.f506313a != null) {
            this.f524499g.f506313a.a(this.f524505p.f524514b.m48589xfda78ef6());
        }
    }

    public void f(java.util.List list) {
        w51.i iVar = this.f524505p;
        iVar.f524515c = list;
        iVar.f524514b.m48595x6cab2c8d(new o51.a(list));
        iVar.f524514b.m48596x940d026a(0);
        iVar.f524514b.m48601xeeb8ffd2(true);
        w51.h hVar = new w51.h(iVar);
        if (list != null) {
            iVar.f524514b.m48604x88423923(hVar);
        }
        int i17 = this.f524499g.f506317e;
        if (iVar.f524515c != null) {
            iVar.f524514b.m48596x940d026a(i17);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/picker/view/OptionsPickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((java.lang.String) view.getTag()).equals("submit")) {
            e();
        }
        a();
        yj0.a.h(this, "com/tencent/mm/picker/view/OptionsPickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
