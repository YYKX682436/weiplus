package o50;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o50.j f424598d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o50.j jVar) {
        super(1);
        this.f424598d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        vg5.a state = (vg5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        o50.j jVar = this.f424598d;
        if (dVar != null && (dVar instanceof wg5.e)) {
            android.view.View U6 = jVar.U6(jVar.V6());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i iVar = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i) ((jz5.n) jVar.f424603g).mo141623x754a37bb();
            if (iVar != null) {
                U6.setOnClickListener(new o50.f(iVar));
            }
            if (((java.lang.Boolean) ((jz5.n) jVar.f424604h).mo141623x754a37bb()).booleanValue()) {
                j75.f Q6 = jVar.Q6();
                if (Q6 != null) {
                    Q6.B3(new wg5.b(U6, jVar.V6()));
                }
            } else {
                U6.setOnClickListener(null);
            }
            if (!(jVar.V6() instanceof ne5.a) && !(jVar.V6() instanceof ld5.b)) {
                U6.setScaleX(0.7f);
                U6.setScaleY(0.7f);
            }
            if (!(jVar.V6() instanceof gd5.a)) {
                jVar.X6(U6);
            }
            jVar.W6().h().addView(U6);
            if (!(jVar.V6() instanceof ne5.a) && !(jVar.V6() instanceof ld5.b)) {
                jVar.W6().h().getViewTreeObserver().addOnGlobalLayoutListener(new o50.g(jVar));
            }
            return jz5.f0.f384359a;
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wg5.d)) {
            android.text.Editable text = jVar.W6().e().getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            em.b W6 = jVar.W6();
            if (W6.f335623m == null) {
                W6.f335623m = (android.widget.CheckBox) W6.f335611a.findViewById(com.p314xaae8f345.mm.R.id.btf);
            }
            boolean isChecked = W6.f335623m.isChecked();
            ct.f3 f3Var = (ct.f3) i95.n0.c(ct.f3.class);
            int length = str.length();
            a31.m mVar = ((x90.m) f3Var).f534152d;
            if (mVar != null) {
                mVar.d(length);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_ForwardExtraText", str);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("KSendGroupToDo", isChecked);
            intent.putExtra("KShowTodoIntroduceView", jVar.f424601e);
            jVar.m158354x19263085().setResult(-1, intent);
            jVar.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
