package ap1;

/* loaded from: classes5.dex */
public class x0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f12761d;

    /* renamed from: e, reason: collision with root package name */
    public j75.f f12762e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f12761d = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View rootView = getRootView();
        j75.f fVar = this.f12762e;
        if (fVar == null) {
            fVar = Q6();
            this.f12762e = fVar;
        }
        if (fVar == null) {
            return;
        }
        int i17 = ((ap1.c2) fVar.getState()).f12626g;
        java.util.ArrayList arrayList = this.f12761d;
        if (i17 == 1) {
            java.lang.String[] stringArray = getResources().getStringArray(com.tencent.mm.R.array.f478019b0);
            kotlin.jvm.internal.o.f(stringArray, "getStringArray(...)");
            arrayList.add(new jz5.l(stringArray[0], ap1.p0.f12716d));
            arrayList.add(new jz5.l(stringArray[1], ap1.p0.f12717e));
        } else if (i17 == 2) {
            java.lang.String[] stringArray2 = getResources().getStringArray(com.tencent.mm.R.array.f478019b0);
            kotlin.jvm.internal.o.f(stringArray2, "getStringArray(...)");
            arrayList.add(new jz5.l(stringArray2[2], ap1.p0.f12718f));
            arrayList.add(new jz5.l(stringArray2[3], ap1.p0.f12719g));
        } else {
            if (i17 != 3) {
                ((com.tencent.mm.ui.widget.dialog.MMFilterDialog) rootView.findViewById(com.tencent.mm.R.id.e4a)).setVisibility(8);
                return;
            }
            java.lang.String[] stringArray3 = getResources().getStringArray(com.tencent.mm.R.array.f478019b0);
            kotlin.jvm.internal.o.f(stringArray3, "getStringArray(...)");
            arrayList.add(new jz5.l(stringArray3[0], ap1.p0.f12716d));
            arrayList.add(new jz5.l(stringArray3[1], ap1.p0.f12717e));
            arrayList.add(new jz5.l(stringArray3[2], ap1.p0.f12718f));
            arrayList.add(new jz5.l(stringArray3[3], ap1.p0.f12719g));
        }
        ap1.w0 w0Var = new ap1.w0(this, fVar);
        com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog = (com.tencent.mm.ui.widget.dialog.MMFilterDialog) rootView.findViewById(com.tencent.mm.R.id.e4a);
        mMFilterDialog.setVisibility(0);
        mMFilterDialog.setBackgroundColor(getColor(com.tencent.mm.R.color.f478489a));
        mMFilterDialog.setLayoutStyle(com.tencent.mm.ui.widget.dialog.x2.AlignLeft);
        mMFilterDialog.setSheetType(com.tencent.mm.ui.widget.dialog.y2.Null);
        mMFilterDialog.setFilterItemList(kz5.b0.c(w0Var));
        fVar.L2(getActivity(), new ap1.q0(this, fVar, w0Var));
        j75.f fVar2 = this.f12762e;
        if (fVar2 == null) {
            fVar2 = Q6();
            this.f12762e = fVar2;
        }
        if (fVar2 != null) {
            fVar2.z3(getActivity(), ap1.v0.f12749d);
        }
    }
}
