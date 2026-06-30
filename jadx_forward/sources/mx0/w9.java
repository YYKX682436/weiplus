package mx0;

/* loaded from: classes5.dex */
public final class w9 extends mx0.t9 {
    @Override // mx0.t9
    public java.lang.String B(int i17) {
        java.util.ArrayList arrayList = this.f413891f;
        boolean z17 = false;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i17);
            if (pVar != null) {
                return pVar.f521553b;
            }
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShootComposingParticipateTemplateAdapter", "invalid position: " + i17);
        return null;
    }

    @Override // mx0.t9
    public boolean E(int i17) {
        java.util.ArrayList arrayList = this.f413891f;
        if (i17 >= 0 && i17 < arrayList.size()) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i17);
            if (pVar != null) {
                return pVar.f521564m;
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShootComposingParticipateTemplateAdapter", "getTemplateIsAIGC - invalid position: " + i17);
        return false;
    }

    @Override // mx0.t9
    public boolean I(int i17) {
        java.util.ArrayList arrayList = this.f413891f;
        if (i17 >= 0 && i17 < arrayList.size()) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i17);
            if (pVar != null) {
                return pVar.f521560i;
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShootComposingParticipateTemplateAdapter", "getTemplateIsFavorite - invalid position: " + i17);
        return false;
    }

    @Override // mx0.t9
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g J(int i17) {
        java.util.ArrayList arrayList = this.f413891f;
        boolean z17 = false;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i17);
            if (pVar != null) {
                return pVar.f521559h;
            }
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShootComposingParticipateTemplateAdapter", "invalid position: " + i17);
        return null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f413891f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        mx0.ba holder = (mx0.ba) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        x(i17, holder);
    }

    @Override // mx0.t9
    public int y(int i17) {
        return i17;
    }

    @Override // mx0.t9
    public int z(int i17) {
        return i17;
    }
}
