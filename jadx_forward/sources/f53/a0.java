package f53;

/* loaded from: classes5.dex */
public final class a0 implements fl5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341166a;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341166a = activityC15905x15a0ec7b;
    }

    @Override // fl5.h
    public void a(int i17, int i18, android.text.Layout layout) {
        if (i17 > i18) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341166a;
        for (java.util.Map.Entry entry : activityC15905x15a0ec7b.D.f341224e.entrySet()) {
            if (i17 > ((java.lang.Number) ((jz5.l) entry.getValue()).f384366d).intValue() && i17 <= ((java.lang.Number) ((jz5.l) entry.getValue()).f384367e).intValue()) {
                if (i17 != i18) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC15905x15a0ec7b.f221545e;
                    if (c22621x7603e017 != null) {
                        c22621x7603e017.setSelection(((java.lang.Number) ((jz5.l) entry.getValue()).f384367e).intValue(), i18);
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                        throw null;
                    }
                }
                int intValue = ((java.lang.Number) ((jz5.l) entry.getValue()).f384367e).intValue();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC15905x15a0ec7b.f221545e;
                if (c22621x7603e0172 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                    throw null;
                }
                if (intValue <= c22621x7603e0172.getText().length()) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = activityC15905x15a0ec7b.f221545e;
                    if (c22621x7603e0173 != null) {
                        c22621x7603e0173.mo81549xf579a34a(intValue);
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                        throw null;
                    }
                }
                return;
            }
            if (i18 > ((java.lang.Number) ((jz5.l) entry.getValue()).f384366d).intValue() && i18 <= ((java.lang.Number) ((jz5.l) entry.getValue()).f384367e).intValue()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0174 = activityC15905x15a0ec7b.f221545e;
                if (c22621x7603e0174 != null) {
                    c22621x7603e0174.setSelection(i17, ((java.lang.Number) ((jz5.l) entry.getValue()).f384366d).intValue());
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                    throw null;
                }
            }
        }
    }
}
