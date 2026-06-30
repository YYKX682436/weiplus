package vh;

/* loaded from: classes12.dex */
public class j extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f518321f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f518322g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f518323h;

    public j(android.view.View view) {
        super(view);
        this.f518321f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqb);
        this.f518322g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hlt);
        this.f518323h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqh);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4642xcbf7010 c4642xcbf7010 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4642xcbf7010) hVar;
        this.f518351d = c4642xcbf7010;
        this.f518321f.setText(((java.text.DateFormat) vh.s.f518350e.b()).format(new java.util.Date(c4642xcbf7010.f134133e)));
        java.lang.String str = c4642xcbf7010.f134137g;
        android.widget.TextView textView = this.f518323h;
        textView.setText(str);
        android.widget.ImageView imageView = this.f518322g;
        imageView.setImageLevel(1);
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord eventStatRecord = c4642xcbf7010.f134158i;
        java.lang.String str2 = "";
        if (eventStatRecord.f134138h.containsKey("battery-low")) {
            boolean b17 = eventStatRecord.b("battery-low", false);
            imageView.setImageLevel(b17 ? 4 : 2);
            long c17 = eventStatRecord.c("battery-pct", -1L);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(b17 ? "电量低" : "电量恢复");
            if (c17 > 0) {
                str2 = " (" + c17 + "%)";
            }
            sb6.append(str2);
            textView.setText(sb6.toString());
            return;
        }
        if (!eventStatRecord.f134138h.containsKey("battery-temp")) {
            if (eventStatRecord.f134138h.containsKey("battery-pct")) {
                long c18 = eventStatRecord.c("battery-pct", -1L);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("电量变化: ");
                sb7.append(c18 > 0 ? java.lang.Long.valueOf(c18) : "/");
                sb7.append("%");
                textView.setText(sb7.toString());
                return;
            }
            return;
        }
        long c19 = eventStatRecord.c("battery-temp", -1L);
        if (c19 != -1) {
            imageView.setImageLevel(3);
        }
        long c27 = eventStatRecord.c("battery-pct", -1L);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("电池温度: ");
        sb8.append(c19 > 0 ? java.lang.Float.valueOf(((float) c19) / 10.0f) : "/");
        sb8.append("°C");
        if (c27 > 0) {
            str2 = " (" + c27 + "%)";
        }
        sb8.append(str2);
        textView.setText(sb8.toString());
    }
}
