package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class f implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o f224334d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar) {
        this.f224334d = oVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224334d;
        java.lang.String replace = oVar.f224483b.getText().toString().replace("+", "");
        if (replace.startsWith("0") || replace.startsWith("*") || replace.startsWith("#")) {
            oVar.f224483b.setText("+");
            oVar.f224493l = "+";
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean z17;
        int measureText;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224334d;
        android.view.ViewGroup.LayoutParams layoutParams = oVar.f224487f.getLayoutParams();
        android.widget.TextView textView = oVar.f224488g;
        android.widget.TextView textView2 = oVar.f224483b;
        if (layoutParams != null) {
            android.text.TextPaint paint = textView2.getPaint();
            if ("+".equals(textView2.getText().toString())) {
                measureText = (int) paint.measureText(textView2.getText().toString());
                android.view.View view = oVar.f224485d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/DialPadController$2", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/DialPadController$2", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
            } else {
                measureText = (int) paint.measureText(((java.lang.Object) textView2.getText()) + "+");
                android.view.View view2 = oVar.f224485d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/DialPadController$2", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/DialPadController$2", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(0);
            }
            android.view.View view3 = oVar.f224487f;
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view3.getLayoutParams();
            layoutParams2.width = measureText;
            view3.setLayoutParams(layoutParams2);
        }
        java.lang.String replace = textView2.getText().toString().replace("+", "");
        if (t83.c.l(replace)) {
            textView.setText(t83.c.f(replace));
            java.util.LinkedList linkedList = oVar.f224497p;
            if (linkedList != null && linkedList.size() > 0) {
                java.lang.String g17 = t83.c.g(replace);
                java.util.Iterator it = oVar.f224497p.iterator();
                while (it.hasNext()) {
                    r45.o57 o57Var = (r45.o57) it.next();
                    if (o57Var != null && o57Var.f463500e.equals(g17)) {
                        z17 = true;
                        break;
                    }
                }
            }
        } else {
            textView.setText(oVar.f224490i.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3k));
        }
        z17 = false;
        android.widget.TextView textView3 = oVar.f224489h;
        if (z17) {
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n nVar = oVar.f224482a;
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16134x74658289 activityC16134x74658289 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16134x74658289) nVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "onModifyCountryCodeByUser:countryCode:%s,mCountryCode:%s", replace, activityC16134x74658289.f224134s);
            int i27 = activityC16134x74658289.f224138w;
            if (i27 == 2 || i27 == -1 || activityC16134x74658289.f224134s.equals(replace)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "modifyCountryCodeByUsder");
            activityC16134x74658289.f224138w = 2;
            if (activityC16134x74658289.f224137v == 1) {
                activityC16134x74658289.f224137v = 2;
            } else {
                activityC16134x74658289.f224137v = 4;
            }
        }
    }
}
