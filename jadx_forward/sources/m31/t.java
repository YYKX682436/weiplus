package m31;

/* loaded from: classes3.dex */
public class t extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final android.view.View.OnClickListener L;
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc activityC11167x3e42f9bc, android.content.Context context, android.view.View.OnClickListener onClickListener) {
        super(context);
        this.M = activityC11167x3e42f9bc;
        this.L = null;
        this.L = onClickListener;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.cnh;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.widget.TextView textView = (android.widget.TextView) u17.findViewById(com.p314xaae8f345.mm.R.id.o3b);
        textView.setOnClickListener(new m31.s(this));
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc activityC11167x3e42f9bc = this.M;
        if (activityC11167x3e42f9bc.f153394g) {
            textView.setText(activityC11167x3e42f9bc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fo_));
            textView.setContentDescription(activityC11167x3e42f9bc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fo_) + "," + activityC11167x3e42f9bc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.akc));
        } else {
            textView.setText(activityC11167x3e42f9bc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.akj));
            textView.setContentDescription(activityC11167x3e42f9bc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.akj) + "," + activityC11167x3e42f9bc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.akc));
        }
        return u17;
    }
}
