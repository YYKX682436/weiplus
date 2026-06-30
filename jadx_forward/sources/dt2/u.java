package dt2;

/* loaded from: classes3.dex */
public final class u implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 f324736d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 c14938xc9a3f782) {
        this.f324736d = c14938xc9a3f782;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        android.os.Vibrator vibrator;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekBar, "seekBar");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 c14938xc9a3f782 = this.f324736d;
        java.lang.String str = c14938xc9a3f782.f206452d;
        if (c14938xc9a3f782.isDragging) {
            gk2.e eVar = ws2.k1.f530599r.a().f530604c;
            float S6 = eVar != null ? ((ct2.j) eVar.a(ct2.j.class)).S6() : -1;
            int max = (int) ((c14938xc9a3f782.f206464s / c14938xc9a3f782.getMax()) * S6);
            int progress = (int) ((c14938xc9a3f782.getProgress() / c14938xc9a3f782.getMax()) * S6);
            java.util.Iterator it = ((java.util.ArrayList) c14938xc9a3f782.fragmentItems).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                vibrator = c14938xc9a3f782.f206463r;
                if (!hasNext) {
                    break;
                }
                int m75939xb282bd08 = ((dt2.v) it.next()).f324738b.m75939xb282bd08(0);
                if (progress == m75939xb282bd08 || ((max < m75939xb282bd08 && progress > m75939xb282bd08) || (max > m75939xb282bd08 && progress < m75939xb282bd08))) {
                    vibrator.vibrate(50L);
                }
            }
            c14938xc9a3f782.f206464s = c14938xc9a3f782.getProgress();
            if (c14938xc9a3f782.getProgress() == 0 || c14938xc9a3f782.getProgress() == c14938xc9a3f782.getMax()) {
                vibrator.vibrate(50L);
            }
        }
        java.util.Iterator it6 = c14938xc9a3f782.f206461p.iterator();
        while (it6.hasNext()) {
            ((android.widget.SeekBar.OnSeekBarChangeListener) it6.next()).onProgressChanged(seekBar, i17, z17);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekBar, "seekBar");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 c14938xc9a3f782 = this.f324736d;
        c14938xc9a3f782.setThumb(c14938xc9a3f782.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.axf));
        java.util.Iterator it = c14938xc9a3f782.f206461p.iterator();
        while (it.hasNext()) {
            ((android.widget.SeekBar.OnSeekBarChangeListener) it.next()).onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekBar, "seekBar");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 c14938xc9a3f782 = this.f324736d;
        c14938xc9a3f782.setThumb(c14938xc9a3f782.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563726b92));
        java.util.Iterator it = c14938xc9a3f782.f206461p.iterator();
        while (it.hasNext()) {
            ((android.widget.SeekBar.OnSeekBarChangeListener) it.next()).onStopTrackingTouch(seekBar);
        }
    }
}
