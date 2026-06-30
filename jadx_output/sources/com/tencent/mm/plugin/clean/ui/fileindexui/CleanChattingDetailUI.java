package com.tencent.mm.plugin.clean.ui.fileindexui;

@gm0.a2
@ul5.d(0)
/* loaded from: classes12.dex */
public class CleanChattingDetailUI extends com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f95738p0 = 0;
    public java.lang.String N;
    public int[] Q;
    public int[] R;
    public long[] S;
    public cw1.q4 W;
    public cw1.c4 X;
    public long Z;
    public final boolean M = !"0".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_new_filters", "0"));
    public boolean P = true;
    public final long[] T = new long[4];
    public final int[] U = new int[4];
    public long V = 0;
    public long Y = 0;

    @Override // com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI
    public void U6(boolean z17, cw1.b3 b3Var, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        char c17;
        com.tencent.mm.sdk.platformtools.o4.J("LATEST_STORAGE_DATA", gm0.j1.b().h(), 1).putLong("latest_clean_chat_log_time", java.lang.System.currentTimeMillis());
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.b0.f331201k = false;
        java.util.List y17 = this.W.y();
        java.util.Iterator it = ((java.util.ArrayList) y17).iterator();
        long j17 = 0;
        while (it.hasNext()) {
            bw1.l lVar = (bw1.l) it.next();
            int i17 = lVar.f24810b;
            if (i17 != 1) {
                c17 = 3;
                if (i17 == 3) {
                    c17 = 1;
                } else if (i17 == 4) {
                    c17 = 2;
                }
            } else {
                c17 = 0;
            }
            long[] jArr = this.T;
            long j18 = jArr[c17];
            long j19 = lVar.f24809a;
            jArr[c17] = j18 + j19;
            j17 += j19;
            int[] iArr = this.U;
            iArr[c17] = iArr[c17] + 1;
        }
        ((ku5.t0) ku5.t0.f312615d).a(aw1.n0.b(y17, ot1.h.Q, Long.MIN_VALUE, com.tencent.wcdb.core.Database.DictDefaultMatchValue, true, new cw1.v4(this, cancellationSignal, b3Var, java.lang.System.currentTimeMillis(), j17), cancellationSignal));
    }

    @Override // com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI
    public void V6() {
        com.tencent.mm.plugin.clean.CleanService$SelectedItems j76 = j7();
        setResult(-1, new android.content.Intent().putExtra("u", this.N).putExtra("select", j76));
        finish();
        mt1.b0.s(31, 0L, java.lang.Long.valueOf(j76.b()), java.lang.Long.valueOf(j76.a()));
    }

    @Override // com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI
    public void e7(int[] iArr) {
        for (int i17 : iArr) {
            if (i17 == 1) {
                this.S = Z6();
            } else if (i17 == 2) {
                this.Q = Y6(true);
            }
        }
        boolean d76 = d7();
        com.tencent.mm.plugin.clean.CleanService$SelectedItems j76 = d76 ? j7() : null;
        X6();
        this.W.I(this.N, this.Q, this.R, this.S, this.f95717y, this.f95718z, this.A, this.P, d76, this.B, this.X, j76);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.f95706n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailUI", "onFilterChanged", "([I)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailUI", "onFilterChanged", "([I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI
    public void f7(boolean z17) {
        cw1.q4 q4Var = this.W;
        if (z17) {
            q4Var.f223269h.set(0, q4Var.f223266e.size());
            q4Var.f223271m = q4Var.f223266e.size();
            q4Var.f223270i = 0L;
            java.util.Iterator it = q4Var.f223266e.iterator();
            while (it.hasNext()) {
                q4Var.f223270i += ((bw1.l) it.next()).f24809a;
            }
        } else {
            q4Var.f223269h.clear();
            q4Var.f223270i = 0L;
            q4Var.f223271m = 0;
            java.util.Iterator it6 = q4Var.f223268g.values().iterator();
            while (it6.hasNext()) {
                ((cw1.j4) it6.next()).getClass();
            }
        }
        q4Var.notifyItemRangeChanged(0, q4Var.getItemCount(), "");
        q4Var.f223265d.h7(q4Var.f223270i, q4Var.f223266e.size(), q4Var.f223271m);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return this.M ? com.tencent.mm.R.layout.e2p : com.tencent.mm.R.layout.f488621ys;
    }

    public final com.tencent.mm.plugin.clean.CleanService$SelectedItems j7() {
        com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems = new com.tencent.mm.plugin.clean.CleanService$SelectedItems();
        java.util.Iterator it = ((java.util.ArrayList) this.W.y()).iterator();
        while (it.hasNext()) {
            bw1.l lVar = (bw1.l) it.next();
            int i17 = lVar.f24821m;
            if (i17 == 0) {
                i17 = 1;
            }
            long j17 = lVar.f24809a / i17;
            cleanService$SelectedItems.e(lVar.f24813e, lVar.f24814f, j17);
            java.util.List list = lVar.f24824p;
            if (list != null) {
                java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
                while (it6.hasNext()) {
                    android.util.Pair pair = (android.util.Pair) it6.next();
                    cleanService$SelectedItems.e((java.lang.String) pair.first, ((java.lang.Long) pair.second).longValue(), j17);
                }
            }
        }
        return cleanService$SelectedItems;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        cw1.q4 q4Var;
        if (i17 == 1 && i18 == -1 && intent != null && (q4Var = this.W) != null) {
            q4Var.f223271m = 0;
            q4Var.f223270i = 0L;
            int size = q4Var.f223266e.size();
            for (int i19 = 0; i19 < size; i19++) {
                if (q4Var.f223269h.get(i19)) {
                    q4Var.f223271m++;
                    q4Var.f223270i += ((bw1.l) q4Var.f223266e.get(i19)).f24809a;
                }
            }
            q4Var.f223265d.h7(q4Var.f223270i, q4Var.f223266e.size(), q4Var.f223271m);
            cw1.q4 q4Var2 = this.W;
            q4Var2.notifyItemRangeChanged(0, q4Var2.getItemCount(), "");
        }
        if (i17 == 1) {
            mt1.b0 b0Var = mt1.b0.f331191a;
            if (mt1.b0.f331202l > this.Z) {
                bw1.u wi6 = bw1.u.wi();
                wi6.f24847f.d();
                wi6.f24848g.d();
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems;
        super.onCreate(bundle);
        boolean d76 = d7();
        this.Y = java.lang.System.currentTimeMillis();
        android.content.Intent intent = getIntent();
        this.N = intent.getStringExtra("u");
        this.f95718z = intent.hasExtra("isSent") ? java.lang.Boolean.valueOf(intent.getBooleanExtra("isSent", false)) : null;
        this.B = intent.getBooleanExtra("onlyInSys", false);
        this.P = intent.getBooleanExtra("withOrigin", true);
        if (d76) {
            com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems2 = (com.tencent.mm.plugin.clean.CleanService$SelectedItems) intent.getParcelableExtra("select");
            this.R = ot1.h.R;
            this.X = new cw1.t4$$a();
            cleanService$SelectedItems = cleanService$SelectedItems2;
        } else {
            this.R = ot1.h.Q;
            this.X = null;
            cleanService$SelectedItems = null;
        }
        java.lang.String str = this.N;
        boolean z17 = this.M;
        if (str == null) {
            if (z17) {
                c7(true, this.f95718z == null, true);
            } else {
                b7(true, true);
            }
            this.Q = Y6(true);
            this.S = Z6();
            if (d76) {
                setMMTitle(this.f95718z == java.lang.Boolean.TRUE ? com.tencent.mm.R.string.n8j : com.tencent.mm.R.string.n8i);
            } else {
                setMMTitle(com.tencent.mm.R.string.a_5);
            }
        } else {
            if (z17) {
                c7(false, this.f95718z == null, false);
            } else {
                b7(false, false);
            }
            this.Q = intent.getIntArrayExtra("st");
            this.S = new long[]{intent.getLongExtra("min", Long.MIN_VALUE), intent.getLongExtra("max", com.tencent.wcdb.core.Database.DictDefaultMatchValue)};
            if (com.tencent.mm.storage.z3.R4(this.N)) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str2 = this.N;
                ((sg3.a) v0Var).getClass();
                setMMTitle(c01.a2.f(str2, str2));
            } else {
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str3 = this.N;
                ((sg3.a) v0Var2).getClass();
                setMMTitle(c01.a2.e(str3));
            }
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.f95706n;
        this.W = new cw1.q4(this);
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(this, 4);
        gridLayoutManager.B = new cw1.u4(this);
        recyclerView.setAdapter(this.W);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.P(this.W.f223276r);
        X6();
        this.W.I(this.N, this.Q, this.R, this.S, this.f95717y, this.f95718z, this.A, this.P, d76, this.B, this.X, cleanService$SelectedItems);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        cw1.q4 q4Var = this.W;
        if (q4Var != null) {
            com.tencent.wcdb.support.CancellationSignal cancellationSignal = q4Var.f223272n;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            q4Var.f223272n = null;
        }
        synchronized (yh5.a.f462419a) {
            yh5.a.f462420b = kz5.p0.f313996d;
            yh5.a.f462421c = new java.util.BitSet();
        }
        super.onDestroy();
    }
}
