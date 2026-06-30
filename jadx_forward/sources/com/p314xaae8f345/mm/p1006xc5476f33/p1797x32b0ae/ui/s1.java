package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes13.dex */
public class s1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f226010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 f226011e;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 activityC16255xf01eb285, android.content.Context context) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441;
        this.f226011e = activityC16255xf01eb285;
        java.util.List A = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().A();
        this.f226010d = A;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4412 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441();
        c3712x3ed8a4412.f14359x58b7f1c = "TestFragment";
        if (A != null) {
            A.add(c3712x3ed8a4412);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4413 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441();
            c3712x3ed8a4413.f14359x58b7f1c = "wxalite6249b65249893bb23a2d4347a17db5b9@pay";
            arrayList.add(c3712x3ed8a4413);
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4414 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441();
            c3712x3ed8a4414.f14359x58b7f1c = "1689826158-test-encrypt-upload-project@pay";
            arrayList.add(c3712x3ed8a4414);
            A.addAll(arrayList);
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4415 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441();
        c3712x3ed8a4415.f14359x58b7f1c = "widget测试";
        A.add(c3712x3ed8a4415);
        java.util.Iterator it = A.iterator();
        while (true) {
            if (!it.hasNext()) {
                c3712x3ed8a441 = null;
                break;
            } else {
                c3712x3ed8a441 = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) it.next();
                if ("wxalite5d4c22060bc77f6a6d1bb7b1b59ed416".equals(c3712x3ed8a441.f14359x58b7f1c)) {
                    break;
                }
            }
        }
        if (c3712x3ed8a441 != null) {
            this.f226010d.remove(c3712x3ed8a441);
            this.f226010d.add(0, c3712x3ed8a441);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 getItem(int i17) {
        java.util.List list = this.f226010d;
        if (list == null || list.size() <= i17) {
            return null;
        }
        return (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) list.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f226010d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.r1 r1Var;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) this.f226010d.get(i17);
        if (view == null || view.getTag() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 activityC16255xf01eb285 = this.f226011e;
            android.view.View inflate = android.view.LayoutInflater.from(activityC16255xf01eb285.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpy, (android.view.ViewGroup) null, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.r1 r1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.r1(activityC16255xf01eb285, inflate);
            inflate.setTag(r1Var2);
            view = inflate;
            r1Var = r1Var2;
        } else {
            r1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.r1) view.getTag();
        }
        java.lang.String str = c3712x3ed8a441.f14359x58b7f1c;
        java.lang.String str2 = c3712x3ed8a441.f14369x346425;
        java.lang.String str3 = c3712x3ed8a441.f14372xa8503287;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        java.lang.String m65334xc682c3fe = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65334xc682c3fe(str, str2, str3);
        if (m65334xc682c3fe == null || m65334xc682c3fe.length() == 0) {
            m65334xc682c3fe = "undefined";
        }
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285.f225872m;
        if (((java.util.HashMap) map).containsKey(c3712x3ed8a441.f14359x58b7f1c)) {
            str = (java.lang.String) ((java.util.HashMap) map).get(c3712x3ed8a441.f14359x58b7f1c);
        }
        r1Var.f226004a.setText(str);
        r1Var.f226005b.setText("minBaselibMajorVersion: ".concat(m65334xc682c3fe));
        return view;
    }
}
