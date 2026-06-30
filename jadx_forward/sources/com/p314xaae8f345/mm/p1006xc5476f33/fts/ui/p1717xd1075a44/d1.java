package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes15.dex */
public class d1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927 f219794d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927 c15622xdd86a927) {
        this.f219794d = c15622xdd86a927;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927 c15622xdd86a927 = this.f219794d;
        int i17 = c15622xdd86a927.f219766f;
        c15622xdd86a927.f219759t = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 x0Var = c15622xdd86a927.f219758s;
        x0Var.f219891n = 7;
        x0Var.invalidateSelf();
        yj0.a.i(true, this, "com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
